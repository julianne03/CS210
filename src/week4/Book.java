package week4;

public class Book {

	public static void main(String[] args) {
		line(10);
		printCityandState(1, "Oregon", "Washington");
		report();
	}

	public static void line(int count) {

	count = 10;
	for (int i = 1; i <= count; i++) {
		System.out.print("*");
	}
	System.out.println();
	}
	
	public static void printCityandState(int number, String city, String state) {
		System.out.println(number + " " + city + ", " + state);
	}
	
	public static String city() {
		return "Seattle";
	}
	
	public static String state() {
		return "Washington";
	}
	
	public static void report() {
		System.out.println(city() + " " + state());
	}
}
