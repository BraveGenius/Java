import java.util.Date;

public class Transaction {
    private int id;
    private int accountId;
    private String transactionType;
    private double amount;
    private String description;
    private Date date;

    public Transaction(int id, int accountId, String transactionType, double amount, String description) {
        this.id = id;
        this.accountId = accountId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.description = description;
        this.date = new Date();
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }
}