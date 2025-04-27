const accountForm = document.getElementById('account-form');
const transactionHistoryDiv = document.getElementById('transaction-history');

accountForm.addEventListener('submit', (e) => {
	e.preventDefault();
	const accountType = document.getElementById('account-type').value;
	const initialBalance = parseFloat(document.getElementById('initial-balance').value);
	const accountHolderName = document.getElementById('account-holder-name').value;
	const accountHolderAddress = document.getElementById('account-holder-address').value;
	const accountHolderPhone = document.getElementById('account-holder-phone').value;

	// Create a new account object
	const account = new Account(accountType, initialBalance, accountHolderName, accountHolderAddress, accountHolderPhone);

	// Add the account to the banking system
	const bankingSystem = new BankingSystem();
	bankingSystem.createAccount(account);

	// Display the transaction history
	displayTransactionHistory(bankingSystem.transactions);
});

function displayTransactionHistory(transactions) {
	transactionHistoryDiv.innerHTML = '';
	transactions.forEach((transaction) => {
		const transactionHTML = `
			<p>Transaction ID: ${transaction.id}</p>
			<p>Account ID: ${transaction.accountId}</p>
			<p>Transaction Type: ${transaction.transactionType}</p>
			<p>Amount: ${transaction.amount}</p>
			<p>Description: ${transaction.description}</p>
			<p>Date: ${transaction.date}</p>
			<hr>
		`;
		transactionHistoryDiv.innerHTML += transactionHTML;
	});
}