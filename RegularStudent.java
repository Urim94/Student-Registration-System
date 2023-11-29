class RegularStudent extends Student {
    private String RStuid;

    public RegularStudent(String fullName, String RStuid, int Age, String department, int year) {
        super(fullName, Age, department, year);
        this.RStuid = RStuid;
    }

    public void display() {
        super.display();
        System.out.println("Program: Regular");
        System.out.println("ID: " + RStuid);
    }
}