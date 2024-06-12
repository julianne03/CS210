package week7;

import java.util.Scanner;

public class Bank {
	private int routingNumber;

	public Bank(int routingNumber) {
		this.routingNumber = routingNumber;
	}

	public static void main(String[] args) {
		Bank bankofAmerica = new Bank(021000322);
		System.out.println("This bank's routing number is " + bankofAmerica.getRoutingNumber());
		Scanner scanner = new Scanner(System.in);
		Customer customer = bankofAmerica.createCustomer(scanner);
		Account account = customer.getAccount();
		account.depositFunds(5000);
		account.withdrawFunds(2300);
		account.displayAccount(customer);
		
		Customer customer1 = bankofAmerica.createCustomer(scanner);
		Account account1 = customer1.getAccount();
		account1.withdrawFunds(25);
		account1.withdrawFunds(10);
		account1.depositFunds(3000);
		account1.displayAccount(customer1);
	}

	public Customer createCustomer(Scanner scanner) {
		System.out.print("Please enter your first name: ");
		String firstName = scanner.next();
		System.out.print("Please enter your last name: ");
		String lastName = scanner.next();
		Customer customer = new Customer(firstName, lastName);
		int accountNumber = customer.getAccount().getAccountNumber();
		System.out.println(firstName + " " + lastName + "\'s account number is " + accountNumber);
		
		return customer;
	}

	public int getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(int routingNumber) {
		this.routingNumber = routingNumber;
	}
	
	

}
