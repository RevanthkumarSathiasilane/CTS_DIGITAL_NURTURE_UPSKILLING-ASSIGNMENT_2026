package src.com.cts;
import java.util.*;
/* 25. HashMap Example
• Objective: Use key-value pairs.
• Task: Map student IDs to names.
• Instructions:
o Create a HashMap with Integer keys and String values.
o Allow the user to add entries.
o Retrieve and display a name based on an entered ID.
*/
public class HashMapStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();
            students.put(id, name);
        }
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();
        if (students.containsKey(searchId)) {
            System.out.println("Student Name: " + students.get(searchId));
        } else {
            System.out.println("Student ID not found.");
        }
    }
}
