package src.com.cts.JavaModule34.greetings;
/*
34. Create and Use Java Modules
• Objective: Understand Java's module system.
• Task: Create two modules: com.greetings and com.utils.
• Instructions:
o Define a module-info.java file in both modules.
o Export a utility class from com.utils and use it in com.greetings.
o Compile and run using the module path. */
import src.com.cts.JavaModule34.utils.MessageUtil;
public class Main {
    public static void main(String[] args) {

        System.out.println(
                MessageUtil.getMessage());
    }
}
