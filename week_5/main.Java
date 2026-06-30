public class main {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student();

        // Populate data using setter methods
        student.setStudentID("CU12345");
        student.setName("Ali");
        student.setCGPA(3.75);
        student.setProgramme("BIT");

        // Retrieve and print data using getter methods
        System.out.println("Student ID : " + student.getStudentID());
        System.out.println("Name       : " + student.getName());
        System.out.println("CGPA       : " + student.getCGPA());
        System.out.println("Programme: " + student.getProgramme());
    }
}
