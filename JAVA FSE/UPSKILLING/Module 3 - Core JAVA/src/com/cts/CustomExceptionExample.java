package src.com.cts;
import java.util.*;
/* 21. Custom Exception
• Objective: Create and use custom exceptions.
• Task: Define a custom exception InvalidAgeException.
• Instructions:
o Throw InvalidAgeException if the user's age is less than 18.
o Catch the exception and display a message
*/
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
