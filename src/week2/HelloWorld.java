package week2;

// import java.util.* -> * means all classes
import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// code with upper case -> Class
		// code with lower case -> Object
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your favorite team: ");
		// call Scanner class's method
		String name = scanner.nextLine();
		for (int i = 0; i < 5; i++) {
			printMessage(name);
		}
		
	}
	
	// static: we can save the memories and create it without making class object
	public static void printMessage(String name) {
		System.out.println(name);
	}
	
}
