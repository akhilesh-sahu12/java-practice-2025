package day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumByDayTransactions {
    public static void main(String[] args) {
        // Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Long> sumByDay = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        HashMap::new, Collectors.summingLong(Transaction::getTxnAmount)));
        System.out.println(sumByDay);

        Map<String, Long> sumByDay2 = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                         Collectors.summingLong(Transaction::getTxnAmount)));
        System.out.println(sumByDay2);
    }
}
