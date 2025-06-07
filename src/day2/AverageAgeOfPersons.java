package day2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageAgeOfPersons {
    public static void main(String[] args) {
       // Calculate the average age of a list of Person objects using Java streams:
        getAverageAge();
    }

    private static void getAverageAge() {
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        IntSummaryStatistics stats= persons.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println("Avg age: "+stats.getAverage());
        System.out.println("Max age: "+stats.getMax());
        System.out.println("Min age: "+stats.getMin());
        System.out.println("Sum age: "+stats.getSum());
        System.out.println("Count age: "+stats.getCount());

        double avgAge= persons.stream().collect(Collectors.summarizingInt(Person::getAge)).getAverage();
        System.out.println("Avg age: "+avgAge);

        OptionalDouble avgAge2= persons.stream().mapToInt(Person::getAge).average();
        System.out.println("Avg age: "+avgAge2.orElse(0));
    }
}
