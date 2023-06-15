public class inherit {
    private int studentAge;

    private String studentName;

    private String studentRollNo;

    private double studentCGPA;
    public inherit(int studentAge, String studentName, String studentRollNo, double studentCGPA) {
        this.studentAge = studentAge;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentCGPA = studentCGPA;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public void setStudentRollNo(String studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    public double getStudentCGPA() {
        return studentCGPA;
    }

    public void setStudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
}