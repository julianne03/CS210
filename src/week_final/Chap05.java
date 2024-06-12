package week_final;

import java.util.*;

public class Chap05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countFactors(91);
		// enterNumber();
		makeRandomNumber();
		rollTheDice();
	}
	
	public static void countFactors(int number) {
		int factor = 2;
		while (number % factor != 0) {
			factor++;
		}
		System.out.println(factor);
	}
	
	public static void enterNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		int sum = 0;
		
		System.out.print("Enter a number (-1 to quit) : ");
		number = scanner.nextInt();
		
		while (number != -1) {
			sum += number;
			System.out.print("Enter a number (-1 to quit) : ");
			number = scanner.nextInt();
		}
		
		System.out.println("The total is " + sum);
	}
	
	public static void makeRandomNumber() {
		Random random = new Random();
		System.out.println(random.nextInt(47) + 1);
		System.out.println(random.nextInt(8) + 23);
	}
	
	public static void rollTheDice() {
		Random random = new Random();
		int count = 0;
		int sum = 0;
		
		while (sum != 7) {
			int number1 = random.nextInt(6) + 1;
			int number2 = random.nextInt(6) + 1;
			sum = number1 + number2;

			System.out.println(number1 + " + " + number2 + " = " + sum);
			count += 1;
		}
		System.out.println("You won after " + count + " tries!");
	}

}
