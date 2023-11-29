import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> registeredStudents = new ArrayList<Student>();

        System.out.println("Welcome to our online registration!");

        while (true) {
            System.out.print("Enter \n1, to register \n2, to exit\n ");
            String input = scanner.next();
        try{
            if (input.equals("1")){
                System.out.println("Enter your Full Name:");
                String fullName = scanner.next();

                System.out.print("Enter your Age: ");
                int Age = scanner.nextInt();
                scanner.nextLine();
                if (Age <= 0){
                    throw new Exception();
                }
                
                System.out.print("Enter your department: ");
                String department = scanner.nextLine();

                System.out.print("Enter year: ");
                int year = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter your program \n1,Regular\n2,Summer: ");
                int program = scanner.nextInt();

                 if (program == 1) {
                    do {
                        try {
                            System.out.print("Enter your ID \n Your ID must be starts with \"R\"(Exaple: R/1234/12): ");
                            String stuid = scanner.next();
                            String[] ID = stuid.split("/", 3);
                            if (!ID[0].equals("R")) {
                                throw new Exception();
                            }
                            if (ID[1].length() != 4) {
                                throw new Exception();
                            }
                            int Rno = Integer.parseInt(ID[1]);
                            if (ID[2].length() != 2) {
                                throw new Exception();
                            }
                            int Syear = Integer.parseInt(ID[2]);
                            
                            String RStuid = (ID[0] + "/" + Rno + "/" + Syear);
                            RegularStudent student = new RegularStudent(fullName, RStuid, Age, department, year);
                            registeredStudents.add(student);
                            break;
                        } catch (RuntimeException ex) {
                            System.out.println("Invalid ID!\nPlease try again!");
                        } catch (Exception ex) {
                            System.out.println("Invalid ID! \n Please try again");
                        }
                    } while (true);
                    
                
                 } else if (program == 2) {
                    do {
                        try {
                            System.out.print("Enter your ID \n Your ID must be starts with \"S\"(Exaple: S/1234/12): ");
                            String stuid = scanner.nextLine();
                            String[] ID = stuid.split("/", 3);
                            if (!ID[0].equals("S")) {
                                throw new Exception();
                            }
                            if (ID[1].length() != 4) {
                                throw new Exception();
                            }
                            int Rno = Integer.parseInt(ID[1]);
                            if (ID[2].length() != 2) {
                                throw new Exception();
                            }
                            int Syear = Integer.parseInt(ID[2]);
                            
                        String SStuid = (ID[0] + "/" + Rno + "/" + Syear);
                        SummerStudent student = new SummerStudent(fullName, SStuid, Age, department, year);
                            registeredStudents.add(student);
                            break;
                        } catch (RuntimeException ex) {
                            System.out.println("Invalid ID!\nPlease try again!");
                        } catch (Exception ex) {
                            System.out.println("Invalid ID! \n Please try again");
                        }
                    } while (true);
                    } else {
                        System.out.println("Invalid program.");
                    }
                
    

                System.out.println("You are successfully registered for this semester.");
                for (Student student : registeredStudents) {
                student.display();
                }
            }
                 else if (input.equals("2")) {
                    System.out.println("Thank you!");
                    System.exit(0);
                 }else{
                    System.out.println("Invlid input!");
                }
        }catch (InputMismatchException ex) {
            System.out.println("Please enter integer only");
        }catch (Exception ex){
            System.out.println("Something went wrong!\n please try again.");
        }
    }
    }

}