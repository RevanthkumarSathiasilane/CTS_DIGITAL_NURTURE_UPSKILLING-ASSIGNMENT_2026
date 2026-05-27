package src.com.cts;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
/* 28. Stream API
• Objective: Process collections using streams.
• Task: Filter and display even numbers from a list.
• Instructions:
o Create a List of integers.
o Use the Stream API to filter even numbers.
o Collect and display the result
*/
public class StreamApiEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers:");
        System.out.println(evenNumbers);
    }
}
