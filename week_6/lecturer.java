public class lecturer extends employee {
    private String subject;
    private String department; // Added from Activity 2

    // Constructor using super() to call the parent class constructor
    public lecturer(String id, String name, String subject, String department) {
        super(id, name); 
        this.subject = subject;
        this.department = department;
    }

    // Method to display lecturer-specific details
    public void displaySubject() {
        System.out.println("Subject     : " + this.subject);
        System.out.println("Department  : " + this.department);
    }
}
