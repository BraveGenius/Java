import java.util.ArrayList;
import java.util.List;

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

    public void deposit(int accountId, double amount) {
        Account account = getAccount(accountId);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(int accountId, double amount) {
        Account account = getAccount(accountId);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void transfer(int senderAccountId, int recipientAccountId, double amount) {
        Account senderAccount = getAccount(senderAccountId);
        Account recipientAccount = getAccount(recipientAccountId);
        if (senderAccount != null && recipientAccount != null) {
            senderAccount.transfer(recipientAccount, amount);
        } else {
            System.out.println("Account not found");
        }
    }

    public void createTransaction(int accountId, String transactionType, double amount, String description) {
        Transaction transaction = new Transaction(transactions.size() + 1, accountId, transactionType, amount,
