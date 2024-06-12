package week_final;

public class Chap02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (-1 * i + 5); j++) {
				System.out.print(".");
			}
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (-1 * i + 5); j++) {
				System.out.print(".");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (-1 * i + 5); j++) {
				System.out.print(".");
			}
			System.out.print(i);
			for (int k = 1; k <= i - 1; k++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
