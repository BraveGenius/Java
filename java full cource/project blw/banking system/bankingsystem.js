class Account {
    constructor(id, accountType, balance, accountHolderName, accountHolderAddress, accountHolderPhone) {
      this.id = id;
      this.accountType = accountType;
      this.balance = balance;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = accountHolderAddress;
      this.accountHolderPhone = accountHolderPhone;
    }
  
    getId() {
      return this.id;
    }
  
    getAccountType() {
      return this.accountType;
    }
  
    getBalance() {
      return this.balance;
    }
  
    setBalance(balance) {
      this.balance = balance;
    }
  
    getAccountHolderName() {
      return this.accountHolderName;
    }
  
    getAccountHolderAddress() {
      return this.accountHolderAddress;
    }
  
    getAccountHolderPhone() {
      return this.accountHolderPhone;
    }
  
    deposit(amount) {
      this.balance += amount;
    }
  
    withdraw(amount) {
      if (this.balance >= amount) {
        this.balance -= amount;
      } else {
        console.log("Insufficient funds");
      }
    }
  
    transfer(recipient, amount) {
      if (this.balance >= amount && recipient!== null) {
        this.balance -= amount;
        recipient.deposit(amount);
      } else {
        console.log("Insufficient funds or recipient account not found");
      }
    }
  }
  
  class Transaction {
    constructor(id, accountId, transactionType, amount, description) {
      this.id = id;
      this.accountId = accountId;
      this.transactionType = transactionType;
      this.amount = amount;
      this.description = description;
      this.date = new Date();
    }
  
    getId() {
      return this.id;
    }
  
    getAccountId() {
      return this.accountId;
    }
  
    getTransactionType() {
      return this.transactionType;
    }
  
    getAmount() {
      return this.amount;
    }
  
    getDescription() {
      return this.description;
    }
  
    getDate() {
      return this.date;
    }
  }
  
  class User {
    constructor(id, username, password, accountId) {
      this.id = id;
      this.username = username;
      this.password = password;
      this.accountId = accountId;
    }
  
    getId() {
      return this.id;
    }
  
    getUsername() {
      return this.username;
    }
  
    getPassword() {
      return this.password;
    }
  
    getAccountId() {
      return this.accountId;
    }
  }
  
  class BankingSystem {
    constructor() {
      this.accounts = [];
      this.transactions = [];
      this.users = [];
    }
  
    createAccount(accountType, balance, accountHolderName, accountHolderAddress, accountHolderPhone) {
      const account = new Account(this.accounts.length + 1, accountType, balance, accountHolderName, accountHolderAddress, accountHolderPhone);
      this.accounts.push(account);
    }
  
    getAccount(accountId) {
      for (const account of this.accounts) {
        if (account.getId() === accountId) {
          return account;
        }
      }
      return null;
    }
  
    deposit(accountId, amount) {
      const account = this.getAccount(accountId);
      if (account!== null) {
        account.deposit(amount);
        const transaction = new Transaction(this.transactions.length + 1, accountId, "Deposit", amount, `Deposit of ${amount}`);
        this.transactions.push(transaction);
      } else {
        console.log("Account not found");
      }
    }
  
    withdraw(accountId, amount) {
      const account = this.getAccount(accountId);
      if (account!== null) {
        if (account.getBalance() >= amount) {
          account.withdraw(amount);
          const transaction = new Transaction(this.transactions.length + 1, accountId, "Withdrawal", amount, `Withdrawal of ${amount}`);
          this.transactions.push(transaction);
        } else {
          console.log("Insufficient funds");
        }
      } else {
        console.log("Account not found");
      }
    }
  
    transfer(senderAccountId, recipientAccountId, amount) {
      const senderAccount = this.getAccount(senderAccountId);
      const recipientAccount = this.getAccount(recipientAccountId);
      if (senderAccount!== null && recipientAccount!== null) {
        if (senderAccount.getBalance() >= amount) {
          senderAccount.transfer(recipientAccount, amount);
          const transaction = new Transaction(this.transactions.length + 1, senderAccountId, "Transfer", amount, `Transfer of ${amount}`);
          this.transactions.push