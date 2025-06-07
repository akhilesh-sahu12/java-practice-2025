package day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoListUsingStream {
    public static void main(String[] args) {

        // Find the intersection of two lists using Java streams:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> intersection=list1.stream().filter(list2::contains).toList();
        System.out.println(intersection);
    }
}
