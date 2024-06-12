package week7;

public class Account {
	private static int accountNumber = 0;
	private double balance;
	private double minimumBalance;
	private double overdraftFee;
	
	public Account() {
		Account.accountNumber += 1;
		this.balance = 0.0;
		this.minimumBalance = 0.0;
		this.overdraftFee = 25.0;
	}
	
	public Account(double initialBalance) {
		Account.accountNumber += 1;
		this.balance = initialBalance;
		this.minimumBalance = 0.0;
		this.overdraftFee = 25.0;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		Account.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public double getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	public void depositFunds(double funds) {
		this.balance += funds;
		System.out.println("You deposit " + funds + " in your account");
		System.out.println("Now, Your balance is " + this.balance);
	}
	
	public void withdrawFunds(double funds) {
		if (balance < (balance - funds)) {
			this.balance -= funds;
			System.out.println("You withdraw " + funds + " from your account");
			System.out.println("Now, Your balance is " + this.balance);
		} else {
			if (this.overdraftFee > 0) {
				this.overdraftFee -= funds;
				System.out.println("You withdraw " + funds + " from your overdraft fee");
				System.out.println("Now, Your balance is " + this.balance);
			} else {
				System.out.println("You cannot withdraw with that funds");
			}
		}

	}
	
	public void displayAccount(Customer customer) {
		System.out.println("--------------------");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + "\'s account ");
		System.out.println("balance: " + this.balance);
		System.out.println("--------------------");
	}
}
