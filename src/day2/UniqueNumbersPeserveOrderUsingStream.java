package day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueNumbersPeserveOrderUsingStream {

    public static void main(String[] args) {
        // Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> numbersWithoutDuplicates =  numbersWithDuplicates.stream().
                collect(Collectors.toCollection(LinkedHashSet::new))
                .stream().toList();
        System.out.println(numbersWithoutDuplicates);

        List<Integer> numbersWithoutDuplicates2 =  numbersWithDuplicates.stream()
                .distinct().toList();
        System.out.println(numbersWithoutDuplicates2);
    }
}
