package src.com.cts;
import java.util.concurrent.*;
/* 41. Executor Service and Callable
• Objective: Use concurrency utilities.
• Task: Execute multiple Callable tasks that return results.
• Instructions:
o Use Executors.newFixedThreadPool() and submit() to execute callables.
o Collect results using Future.get().
*/
public class ExecutorCallable {
    public static void main(String[] args) {
        try {
            ExecutorService executor = Executors.newFixedThreadPool(3);
            //callable task-1
            Callable<Integer> task1 = () -> {
                System.out.println("Task 1 is running...");
                return 10 + 20;
            };
            //callable task-2
            Callable<Integer> task2 = () -> {
                System.out.println("Task 2 is running...");
                return 30 + 40;
            };
            //callable task-3
            Callable<Integer> task3 = () -> {
                System.out.println("Task 3 is running...");
                return 50 + 60;
            };

            Future<Integer> future1 = executor.submit(task1);
            Future<Integer> future2 = executor.submit(task2);
            Future<Integer> future3 = executor.submit(task3);
            Integer result1 = future1.get();
            Integer result2 = future2.get();
            Integer result3 = future3.get();

            System.out.println("\nResult from Task 1: " + result1);
            System.out.println("Result from Task 2: " + result2);
            System.out.println("Result from Task 3: " + result3);
            executor.shutdown();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
