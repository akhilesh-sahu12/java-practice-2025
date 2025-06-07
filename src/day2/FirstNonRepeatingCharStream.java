package day2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharStream {
    public static void main(String[] args) {
        String name = "aabccbd";

        Map<Character, Long> countingFreq = name.chars().mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(countingFreq);

        Optional<Character> ch = name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(ch.orElseGet(() -> null));
    }
}
