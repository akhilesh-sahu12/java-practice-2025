package day2;

import java.util.Arrays;
import java.util.List;

public class IsPrimeUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        Boolean isPrime=numbers.stream().anyMatch(IsPrimeUsingStream::isPrime);
        System.out.println(isPrime);

        List<Integer> numbers2= Arrays.asList(4, 6, 8, 10, 12, 14);
        Boolean isPrime2=numbers2.stream().anyMatch(IsPrimeUsingStream::isPrime);
        System.out.println(isPrime2);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
