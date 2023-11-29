class Student {
    private String fullName, department;
    private int Age, year;

    public Student(String fullName, int Age, String department, int year) {
        this.fullName = fullName;
        this.Age = Age;
        this.department = department;
        this.year = year;
    }
       public String getName(){
    return fullName;
   }
   public String getdep(){
    return department;
   }
   public int getAge(){
    return Age;
   }
   public int getyear(){
    return year;
   }
   public void setName(String fullName){
    this.fullName = fullName;
   }
   public void setdep(String department){
    this.department = department;
   }
   public void setAge(int Age){
    
    this.Age = Age;
   }
   public void setyear(int year){
    this.year = year;
   }

    public void display() {
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + Age);
        System.out.println("Department: " + department);
        System.out.println("Year: " + year);
    }
}
