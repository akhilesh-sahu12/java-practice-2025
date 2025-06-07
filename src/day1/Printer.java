package day1;

public class Printer {
    private int number = 1;
    private static final int MAX_NUM = 20;

    public synchronized void printOdd() {
        while (number <= MAX_NUM) {
            if (number % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX_NUM) {
            if (number % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
