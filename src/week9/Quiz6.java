package week9;

import java.util.*;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		try {
			int num = scanner.nextInt();
			
			if (num != 0) {
				throw new Exception("Not zero");
			}
			System.out.println("Im happy");
		}
		catch (InputMismatchException e) {
			System.out.println("invalid");
		} catch (Exception e) {
			System.out.println("Catch block is here");
		}
		finally {
			System.out.println("Finally Clause Executed");
		}
		System.out.println("end of main");
	}

}
