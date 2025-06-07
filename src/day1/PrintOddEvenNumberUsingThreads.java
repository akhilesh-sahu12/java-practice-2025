package day1;

public class PrintOddEvenNumberUsingThreads {
    public static void main(String[] args) {

        Printer printer=new Printer();
        Thread oddThread=new Thread(printer::printOdd, "OddThread");
        Thread evenThread=new Thread(printer::printEven, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}