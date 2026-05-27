package src.com.cts;
import java.util.*;
/* 26. Thread Creation
• Objective: Implement multithreading.
• Task: Create and run two threads that print messages.
• Instructions:
o Define a class that extends Thread or implements Runnable.
o In the run() method, print a message multiple times.
o Start both threads and observe the output.
*/
class MyThread implements Runnable {
    private String message;
    MyThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        MyThread task1 = new MyThread("Thread 1 is running");
        MyThread task2 = new MyThread("Thread 2 is running");
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
