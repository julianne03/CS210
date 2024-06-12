package week3;

import java.util.*;

public class WordSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user to enter a list of strings.
		System.out.print("Please enter a list of strings seperated by spaces: ");
		String words = scanner.nextLine();

		// Prompt the user to enter the word to search for
		System.out.print("Please enter the word to search for: ");
		String searchWord = scanner.next();
		scanner.close();
		
		// Parse the list of strings into an array
		List<String> wordList = Arrays.asList(words.split(" "));
		int frequency = Collections.frequency(wordList, searchWord);
		String isExsist = frequency > 0 ? "yes" : "no";

		System.out.println("The list of the words: " + wordList);
		System.out.println("The search word: " + searchWord);
		System.out.println("whether the search word exists in the list: " + isExsist);
		if (frequency > 0) System.out.println("how many times it is found in the list: " + frequency);
	}
}