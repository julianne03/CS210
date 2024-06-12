package week4;

//import myutils.*;
public class StudentMealSystem {
	public static void main(String args[]) {
		// creating student object
		Student aStudent = new Student("Jane Doe", 19, "123 Springfield Rd");
		
		// create mealCard object
		MealCard aMealCard = new MealCard(aStudent);
		// create another meallCard object with different constructor method
		MealCard anotherMealCard = new MealCard(aStudent, 50);
		
		System.out.println("Student name: " + aMealCard.getStudent().getName());
		System.out.println("Student age: " + aMealCard.getStudent().getAge());
		System.out.println("Student address: " + aMealCard.getStudent().getAddress());
		System.out.println("Meal card 1 balance: " + aMealCard.getBalance());
		System.out.println("Meal card 2 balance: " + anotherMealCard.getBalance());
		System.out.println("\nUsing meal card 1 to purchase a 10-point item.");
		aMealCard.purchaseItem(10);
		System.out.println("Meal card 1 balance: " + aMealCard.getBalance());
		System.out.println("\nAdding 15 points to meal card 2.");
		anotherMealCard.purchasePoints(15);
		anotherMealCard.purchasePoints(5);
		anotherMealCard.purchasePoints(20);
		anotherMealCard.purchasePoints(10);
		anotherMealCard.purchasePoints(15);
		anotherMealCard.purchasePoints(15);
		anotherMealCard.purchasePoints(15);
		System.out.println("Meal card 2 balance: " + anotherMealCard.getBalance());
	}
}
