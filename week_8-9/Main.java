import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner for user input and ArrayList to store tasks
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        String filename = "task.txt";

        // ==========================================
        // ACTIVITY 1: ADD TASKS & DISPLAY IN TERMINAL
        // ==========================================
        System.out.println("===== ADD TASKS =====");
        
        // Allow user to enter 3 tasks
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Task " + i + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        // Display tasks from memory
        System.out.println("\n===== TASK LIST =====");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // ==========================================
        // ACTIVITY 2: FILE I/O (SAVE & LOAD TASKS)
        // ==========================================
        
        // 1. Save tasks into task.txt
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
            System.out.println("\nTasks saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }

        // 2. Read and display tasks loaded from task.txt
        System.out.println("\n===== TASKS LOADED FROM FILE =====");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        scanner.close();
    }
}
