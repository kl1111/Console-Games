package consoleGames;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(50);
	}
	
	public static void fizzBuzz(int i){
		for (int j = 1; j <= i; j++) {
			if (j % 3 == 0 && j % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (j % 3 == 0) {
				System.out.println("FIZZ");
			} else if (j % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(j);
			}
		}
	}

}
