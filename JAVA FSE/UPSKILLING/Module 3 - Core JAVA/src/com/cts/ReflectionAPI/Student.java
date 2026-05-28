package src.com.cts.ReflectionAPI;
/* 39. Reflection in Java
• Objective: Use Java Reflection API.
• Task: Load a class and invoke methods dynamically.
• Instructions:
o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without
directly referencing it in code.
o Print the method names and parameters.
*/
public class Student {
    public void display() {
        System.out.println("Display method called.");
    }
    public int add(int a, int b) {
        return a + b;
    }
}
