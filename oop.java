import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your studentid: ");
        String Studentid = sc.nextLine();
        
        System.out.print("Enter your coding marks: ");
        int Coding_marks = sc.nextInt();
        
        sc.close();
    }
}
