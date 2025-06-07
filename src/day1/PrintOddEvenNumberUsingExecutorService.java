package day1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintOddEvenNumberUsingExecutorService {
    static int number = 1;
    static final int MAX_NUM = 20;
    static final Object lock = new Object();

    public static void main(String[] args) {

        PrintOddEvenNumberUsingExecutorService printOddEvenNumberUsingExecutorService = new PrintOddEvenNumberUsingExecutorService();
        printOddEvenNumberUsingExecutorService.printNumber();


    }

    private void printNumber() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> {
              while (number<=MAX_NUM) {
                  synchronized (lock) {
                      if (number % 2 != 0) {
                          System.out.println(Thread.currentThread().getName() + ": " + number++);
                          lock.notify();
                      } else {
                          try {
                              lock.wait();
                          } catch (InterruptedException e) {
                              throw new RuntimeException(e);
                          }
                      }
                  }
              }
        });

        executorService.execute(() -> {
            while (number<=MAX_NUM){
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + number++);
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        });
        executorService.shutdown();
    }
}
