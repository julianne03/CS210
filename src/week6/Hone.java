package week6;

public class Hone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;

		do

		{ // 1

			if (i < 2) {

				System.out.println("Go Seahawks");

			}

			i--;

		} while (i > 0);

	}

	public static boolean determineShips(int a) {

		if (a < 100) {
			return true;
		} else if (a < 50) {
			return false;
		}
		if (a > 200) {
			return true;
		}
		return false;

	}

}
