public class Account {
    private int id;
    private String accountType;
    private double balance;
    private String accountHolderName;
    private String accountHolderAddress;
    private String accountHolderPhone;

    public Account(int id, String accountType, double balance, String accountHolderName, String accountHolderAddress, String accountHolderPhone) {
        this.id = id;
        this.accountType = accountType;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountHolderAddress = accountHolderAddress;
        this.accountHolderPhone = accountHolderPhone;
    }

    public int getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountHolderAddress() {
        return accountHolderAddress;
    }

    public String getAccountHolderPhone() {
        return accountHolderPhone;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void transfer(Account recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}