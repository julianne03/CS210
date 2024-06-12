package week_final;

import java.util.Arrays;
import java.util.Random;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Julianne";
		String sub = name.substring(2, 5);
		System.out.println(sub);
		
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		System.out.println(randomNumber);
		
		int[] array1 = {12, 48, -2, -30};
		int[] array2 = {12, 48, -2};
		
		System.out.println(Arrays.toString(array1));
	}

}
