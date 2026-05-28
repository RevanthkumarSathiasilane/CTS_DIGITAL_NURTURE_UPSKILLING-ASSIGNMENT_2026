package src.com.cts;
import java.util.*;
/*
37. Using javap to Inspect Bytecode
• Objective: Explore compiled .class files.
• Task: Compile a Java class and inspect its bytecode using javap.
• Instructions:
o Create a class with a method.
o Compile it and run javap -c ClassName.
o Interpret the bytecode output.
*/
public class Calculator{
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        System.out.println("Result = " + result);
    }
}
/*
In class file: "javap -c Calculator" important
Compiled from "Calculator.java"
public class src.com.cts.Calculator {
  public src.com.cts.Calculator();
    Code:
         0: aload_0
         1: invokespecial #1
         4: return

  public int add(int, int);
    Code:
         0: iload_1 - loading paramete 1
         1: iload_2 - '' 2
         2: iadd - adding
         3: ireturn - return;

  public static void main(java.lang.String[]);
    Code:
         0: new           #7                  // class src/com/cts/Calculator
         3: dup
         4: invokespecial #9                  // Method "<init>":()V
         7: astore_1
         8: aload_1
         9: bipush        10
        11: bipush        20
        13: invokevirtual #10                 // Method add:(II)I
        16: istore_2
        17: getstatic     #14                 // Field java/lang/System.out:Ljava/io/PrintStream;
        20: iload_2
        21: invokedynamic #20,  0             // InvokeDynamic #0:makeConcatWithConstants:(I)Ljava/lang/String;
        26: invokevirtual #24                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        29: return
}
*/
