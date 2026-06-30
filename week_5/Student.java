public class Student {
    private String studentID;
    private String name;
    private double cgpa;
    private String programme; 

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.cgpa;
    }

    public String getProgramme() {
        return this.programme;
    }
}
