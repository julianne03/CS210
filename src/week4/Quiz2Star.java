package week4;

public class Quiz2Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {   // i = 0 - 1 -2 -3 -4
			for (int j = i; j > 0; j--) { // 공백 구현 (0 - 1 -2 - 3 - 4)
				System.out.print(" ");
			}
			for (int j = (5-i); j > 0; j--) { // 별 찍기 구현 (5- 4-3-2-1)
				System.out.print("#");
			}
			System.out.println();
		}
	}

}

// #####
//  ####
//   ###
//    ##
//     #