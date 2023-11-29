class SummerStudent extends Student {
    private String SStuid;

    public SummerStudent(String fullname, String SStuid, int Age, String department, int year) {
        super(fullname, Age, department, year);
        this.SStuid = SStuid;
    }

    public void display() {
        super.display();
        System.out.println("Program: Summer");
        System.out.println("ID: " + SStuid);
    }
}