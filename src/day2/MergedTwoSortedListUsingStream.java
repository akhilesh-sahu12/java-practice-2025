package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoSortedListUsingStream {
    public static void main(String[] args) {
        // Merge two sorted lists into a single sorted list using Java streams:
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> mergeSortedList=
                Stream.concat(list1.stream(), list2.stream())
                        .sorted().toList();
        System.out.println(mergeSortedList);
    }
}
