package src.com.cts;
/* 2.Simple Calculator:
Objective: Practice arithmetic operations and user input.
Task: Develop a calculator that performs addition, subtraction, multiplication, and division. • Instructions: o Prompt the user to enter two numbers. o Ask the user to choose an operation.
Display the result of the operation Code in java */
import java.util.*;
public class SimpleCalculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number: ");
    double num1 = sc.nextDouble();
    System.out.print("Enter second number: ");
    double num2 = sc.nextDouble();
    System.out.println("\nChoose an operation:");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");
    System.out.print("Enter your choice (1-4): ");
    int choice = sc.nextInt();
    double result;
    switch (choice) {
        case 1:
            result = num1 + num2;
            System.out.println("Result: " + result);
            break;
        case 2:
            result = num1 - num2;
            System.out.println("Result: " + result);
            break;
        case 3:
            result = num1 * num2;
            System.out.println("Result: " + result);
            break;
        case 4:
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error! Division by zero is not allowed.");
            }
            break;
        default:
            System.out.println("Invalid choice!");
    }
  }
}