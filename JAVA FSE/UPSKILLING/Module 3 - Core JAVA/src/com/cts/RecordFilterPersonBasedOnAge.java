package src.com.cts;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
/* 29. Records
• Objective: Use the record keyword for immutable data structures (Java 16+).
• Task: Create a record to represent a Person with name and age.
• Instructions:
o Define a record named Person.
o Create instances and print them.
o Use records in a List and filter based on age using Streams.
*/
record Person(String name, int age) {}
public class RecordFilterPersonBasedOnAge {
    public static void main(String[] args) {
        Person p1 = new Person("Revanth", 21);
        Person p2 = new Person("Arun", 17);
        Person p3 = new Person("Kavin", 25);
        System.out.println("Person Records:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> people = Arrays.asList(p1, p2, p3);
        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());
        System.out.println("\nAdults:");
        adults.forEach(System.out::println);
    }
}
