package src.com.cts;
/* 40. Virtual Threads (Java 21)
• Objective: Use lightweight threads for scalable concurrency.
• Task: Launch 100,000 virtual threads that each print a message.
• Instructions:
o Use Thread.startVirtualThread(() -> { ... }).
o Measure performance versus traditional threads.
*/
public class VirtualThread {
    public static void main(String[] args)
            throws InterruptedException {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            int threadNumber = i;
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread: " + threadNumber);
            });
        }
        Thread.sleep(3000);
        long endTime = System.currentTimeMillis();
        System.out.println("\nExecution Time: " + (endTime - startTime) + " ms");
    }
}
