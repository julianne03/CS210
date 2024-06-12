package week4;

/*
* Introduction to OOP with Java, McGraw-Hill
*
* Chapter 7 Exercise 15
*
*/
public class MealCard {
	
	// class variables
	public static int DEFAULT_POINTS = 100;
	private int balance;
	// making student object in MealCard class
	private Student student;

	// constrctor method
	public MealCard(Student student) {
		this(student, DEFAULT_POINTS);
	}

	// this is also constructor method, but different form
	public MealCard(Student student, int points) {
		this.student = student;
		balance = points;
	}

	public boolean purchaseItem(int points) {
		if (points > balance)
			return false; // not enough balance
		balance -= points;
		return true;
	}

	public void purchasePoints(int points) {
		balance += points;
	}

	public int getBalance() {
		return balance;
	}

	public Student getStudent() {
		return student;
	}
}
