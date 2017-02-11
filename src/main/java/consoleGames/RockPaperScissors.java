package consoleGames;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	static String computersHand;
	static String playersHand;

	public static void main(String[] args) {
		number();
	}

	public static void number() {
		System.out.println("======WELCOME TO ROCK PAPER SCISSORS!========");
		System.out.println("Please choose rock, paper or scissors");
		
		Scanner sc = new Scanner(System.in);
		playersHand = sc.nextLine();
		System.out.println("You chose " + playersHand);
		randomNumberGenerator();
		
		if (playersHand.equalsIgnoreCase("rock")) {
			if (computersHand.equals("rock")) {
				System.out.println("It's a draw!");
			} else if (computersHand.equals("paper")) {
				System.out.println("You lose!");
			} else if (computersHand.equals("scissors")) {
				System.out.println("You win!");
			} number();
		} else if (playersHand.equalsIgnoreCase("paper")) {
			if (computersHand.equals("rock")) {
				System.out.println("You win!");
			} else if (computersHand.equals("paper")) {
				System.out.println("It's a draw!");
			} else if (computersHand.equals("scissors")) {
				System.out.println("You lose!");
			} number();
		} else if (playersHand.equalsIgnoreCase("scissors")) {
			if (computersHand.equals("rock")) {
				System.out.println("You lose!");
			} else if (computersHand.equals("paper")) {
				System.out.println("You win!");
			} else if (computersHand.equals("scissors")) {
				System.out.println("It's a draw!");
			} number();
		} else {
			System.out.println("Invalid option chosen, please try again");
			number();
		}
	}

	public static String randomNumberGenerator() {
		Random rn = new Random();
		int answer = rn.nextInt(9);
		if (answer <= 2) {
			computersHand = "rock";
			System.out.println("Computer chose " + computersHand);
		} else if (answer <= 5) {
			computersHand = "paper";
			System.out.println("Computer chose " + computersHand);
		} else {
			computersHand = "scissors";
			System.out.println("Computer chose " + computersHand);
		}
		return computersHand;
	}

}
