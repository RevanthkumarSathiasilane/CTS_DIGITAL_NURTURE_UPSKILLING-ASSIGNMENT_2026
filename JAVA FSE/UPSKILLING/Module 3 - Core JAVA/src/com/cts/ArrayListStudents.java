package src.com.cts;
import java.util.*;
/* 24. ArrayList Example
• Objective: Use dynamic arrays.
• Task: Manage a list of student names.
• Instructions:
o Create an ArrayList to store names.
o Allow the user to add names to the list.
o Display all names entered.
*/
public class ArrayListStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of student " + i + ": ");
            String name = sc.nextLine();
            studentNames.add(name);
        }
        System.out.println("\nStudent Names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
