public class main {
    public static void main(String[] args) {
        // Create an instance of lecturer with all required details
        lecturer prof = new lecturer("L100", "Dr Ahmad", "Java Programming", "Faculty of Information Technology");

        // Display the inherited information and specific lecturer information
        prof.displayInfo();
        prof.displaySubject();
    }
}
