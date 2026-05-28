package src.com.cts.ReflectionAPI;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
/* 39. Reflection in Java
• Objective: Use Java Reflection API.
• Task: Load a class and invoke methods dynamically.
• Instructions:
o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without
directly referencing it in code.
o Print the method names and parameters.
*/
public class ReflectionExample {
    public static void main(String[] args) {

        try {
            // loaded class dynamically
            Class<?> cls = Class.forName("src.com.cts.ReflectionAPI.Student");//<?> - Generics WildCard
            System.out.println("Class Name: " + cls.getName());
            // creating object dynamically in this !!
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("\nMethods in Student class:");
            for (Method method : methods) {
                System.out.println("\nMethod Name: " + method.getName());
                Parameter[] params = method.getParameters();
                System.out.println("Parameter Count: " + params.length);
                for (Parameter param : params) {
                    System.out.println("Parameter Type: " + param.getType().getSimpleName());
                }
            }
            //invoking display() dynamically
            Method displayMethod = cls.getDeclaredMethod("display");
            System.out.println("\nInvoking display() method:");
            displayMethod.invoke(obj);

            //invoking add() dynamically
            Method addMethod = cls.getDeclaredMethod("add", int.class, int.class);
            Object result = addMethod.invoke(obj, 10, 20);
            System.out.println("\nResult from add(): "+ result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
