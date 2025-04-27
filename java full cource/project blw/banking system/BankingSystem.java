import java.util.ArrayList;
import java.util.Date;
import java.util.List;


    class Account{
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
    class Transaction{
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
    class User{
    private int id;
    private String username;
    private String password;
    private int accountId;

    public User(int id, String username, String password, int accountId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAccountId() {
        return accountId;
    }
}
public class BankingSystem {
    private List<Account> accounts;
    private List<Transaction> transactions;
    private List<User> users;

    public BankingSystem() {
        accounts = new ArrayList<>();
        transactions = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void createAccount(String accountType, double balance, String accountHolderName, String accountHolderAddress, String accountHolderPhone) {
        Account account = new Account(accounts.size() + 1, accountType, balance, accountHolderName, accountHolderAddress, accountHolderPhone);
        accounts.add(account);
    }

    public Account getAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getId() == accountId) {
                return account;
            }
        }
        return null;
    }

    public void deposit(int accountId, double amount) {
        Account account = getAccount(accountId);
        if (account!= null) {
            account.deposit(amount);
            Transaction transaction = new Transaction(transactions.size() + 1, accountId, "Deposit", amount, "Deposit of " + amount);
            transactions.add(transaction);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accountId, double amount) {
        Account account = getAccount(accountId);
        if (account!= null) {
            account.withdraw(amount);
            Transaction transaction = new Transaction(transactions.size() + 1, accountId, "Withdrawal", amount, "Withdrawal of " + amount);
            transactions.add(transaction);
        } else {
            System.out.println("Account not found");
        }
    }

    public void transfer(int senderAccountId, int recipientAccountId, double amount) {
        Account senderAccount = getAccount(senderAccountId);
        Account recipientAccount = getAccount(recipientAccountId);
        if (senderAccount != null && recipientAccount != null) {
            senderAccount.transfer(recipientAccount, amount);
            Transaction transaction = new Transaction(transactions.size() + 1, senderAccountId, "Transfer", amount, "Transfer of " + amount);
            transactions.add(transaction);
        } else {
            System.out.println("Account not found");
        }
    }
public static void main(String[] args) {
    BankingSystem bankingSystem = new BankingSystem();

    bankingSystem.createAccount("Checking", 1000.0, "John Doe", "123 Main St", "123-456-7890");
    bankingSystem.createAccount("Savings", 500.0, "Jane Doe", "456 Elm St", "987-654-3210");

    bankingSystem.deposit(1, 500.0);
    bankingSystem.withdraw(1, 200.0);
    bankingSystem.transfer(1, 2, 300.0);

    for (Transaction transaction : bankingSystem.transactions) {
        System.out.println("Transaction ID: " + transaction.getId());
        System.out.println("Account ID: " + transaction.getAccountId());
        System.out.println("Transaction Type: " + transaction.getTransactionType());
        System.out.println("Amount: " + transaction.getAmount());
        System.out.println("Description: " + transaction.getDescription());
        System.out.println("Date: " + transaction.getDate());
        System.out.println();
    }
}
}