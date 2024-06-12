package week5;

import java.util.Scanner;

public class BattleShip {
	private static char[][] userBoard = new char[20][20];
	private static char[][] shipBoard = new char[20][20];
	private static final String[] shipsName = {"Carrier", "Battleship", "Destroyer", "Cruiser", "Submarine"};
	private static final int[] shipsLength = {5, 4, 2, 3, 3};
	private static int firePoint = 0;
	private static Scanner scanner = new Scanner(System.in);
	
	private static void createBoard() {
		for (int i = 0; i < shipBoard.length; i++) {
			for (int j = 0; j < shipBoard[i].length; j++) {
				userBoard[i][j] = '0';
				shipBoard[i][j] = '0';
			}
		}
	}
	
	private static void printBoard(String boardName) {
		char[][] board = boardName == "ship" ? shipBoard : userBoard;
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private static void placeShip(int x, int y, String direction, int shipLength) {
		if (direction.equals("v")) {
			for (int i = x; i < x + shipLength; i++) {
				shipBoard[i][y] = '*';
			}
		} else { // horizontal
			for (int i = y; i < y + shipLength; i++) {
				shipBoard[x][i] = '*';
			}
		}
		printBoard("ship");
	}
	
	private static void gameSetting() {
		// 1. create user board, game board
		createBoard();
		// while if the user place all ships
		
		int x = 0;
		int y = 0;
		String direction = "v";
		
		System.out.println("Place the ships first!");
		System.out.println("One Carrier of length 5\n"
				+ "One Battleship of length 4\n"
				+ "One Destroyer of length 2\n"
				+ "One Cruisers of length 3\n"
				+ "One Submarine length 3");
		System.out.println("---------------------------");
		
		for (int i = 0; i < shipsName.length; i++) {
			System.out.print("Please type the starting x, y coordinates of the " + shipsName[i] + " with length of " + shipsLength[i] + ": ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			System.out.print("Please type the direction of the " + shipsName[i] + " (vertical(v) or horizontal(h): ");
			direction = scanner.next();
			
			placeShip(x, y, direction, shipsLength[i]);
		}
	}

	private static void fire(int x, int y) {
		if (shipBoard[x][y] == '*') {
			userBoard[x][y] = 'X';
			firePoint += 1;
			System.out.println("HIT!");
		} else if (userBoard[x][y] == '?') {
			System.out.println("You already chose it before. Please choose the other location.");
		}
		else {
			userBoard[x][y] = '?';
			System.out.println("MISS!");
		}
		printBoard("user");
	}

	private static void gameStart() {
		int x = 0;
		int y = 0;
		while (firePoint < 17) {
			System.out.print("Plaese enter x, y coordinates of ship where you are guessing: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
			fire(x, y);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to battleship game!");
		System.out.println("---------------------------");
		gameSetting();
		System.out.println("Let's play!");
		System.out.println("---------------------------");
		gameStart();
		System.out.println("You found all ships' location!");
		System.out.println("----------THE END----------");
	}

}
