package day2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestStringUsingStream {

    public static void main(String[] args) {
        // Find the longest string in a list of strings using Java streams:
        printLongestStringFromAList();
    }

    private static void printLongestStringFromAList() {
        List<String> strings = Arrays
                .asList("apple", "banana", "cherryCake", "date", "grapefruit");
        Optional<String> maxLength=strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println(maxLength.orElse(null));
    }

}
