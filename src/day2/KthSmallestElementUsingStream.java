package day2;

import java.util.Arrays;
import java.util.OptionalInt;

public class KthSmallestElementUsingStream {

    public static void main(String[] args) {
        // Find the kth smallest element in an array using Java streams:

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element

        int[] filterArray = Arrays.stream(array).sorted().skip(k-1).toArray();
        System.out.println(Arrays.toString(filterArray));

        OptionalInt thirdLargestElement = Arrays.stream(array).sorted().skip(k-1).findFirst();
        System.out.println(thirdLargestElement.orElse(-1));
    }
}
