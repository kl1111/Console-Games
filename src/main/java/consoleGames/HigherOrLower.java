package consoleGames;

import java.util.Scanner;

public class HigherOrLower {

	static int max;
	static int min;
	static int guess;
	static String input;

	public static void main(String[] args) {
		startGame();
	}

	public static void startGame() {
		max = 1000;
		min = 1;
		guess = 500;

		System.out.println("==============NEW GAME================");
		System.out.println("Welcome to Higher or Lower!");
		System.out.println("Pick a number between " + min + " and " + max + " but don't tell me!");

		System.out.println("Is the number higher or lower than " + guess + "?");
		System.out.println("1 = HIGHER, 2 = LOWER, 3 = EQUALS");

		max += 1;
		takeUserInput();
	}
	
	public static void setUp(){
		guess = (max + min) / 2;
		System.out.println("Is the number higher or lower than " + guess + "?");
		System.out.println("1 = HIGHER, 2 = LOWER, 3 = EQUALS");
		takeUserInput();
	}

	public static void takeUserInput() {
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		if (input.toLowerCase().equals("1")) {
			min = guess;
			setUp();
		} else if (input.toLowerCase().equals("2")) {
			max = guess;
			setUp();
		} else if (input.toLowerCase().equals("3")) {
			System.out.println("Your number is " + guess);
			startGame();
		} else {
			System.out.println("Please try again");
			takeUserInput();
		}
	}

}
