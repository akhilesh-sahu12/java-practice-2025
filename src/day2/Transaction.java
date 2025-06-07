package day2;

public class Transaction {
    private String date;
    private long txnAmount;

    public Transaction(String date, long txnAmount) {
        this.date = date;
        this.txnAmount = txnAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(long txnAmount) {
        this.txnAmount = txnAmount;
    }
}
