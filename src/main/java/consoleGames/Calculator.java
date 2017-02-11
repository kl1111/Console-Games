package consoleGames;

public class Calculator {

	public static void main(String[] args) {
		add(3, 4, 45, 54561);
		substract(0.523542, 45.3);
		multiply(5, 8.5, -5);
		divide(25, 2);
	}
	
	public static void add(double...numbersToAdd){
		double total = 0;
		for (double num : numbersToAdd){
			total += num;
		}
		System.out.println(total);
	}
	
	public static void substract(double x, double y){
		double z = x - y;
		System.out.println(z);
	}
	
	public static void multiply(double...numbersToMultiply){
		double total = 1;
		for (double num: numbersToMultiply){
			total *= num;
		} System.out.println(total);
	}
	
	public static void divide(double x, double y){
		double z = x/y;
		System.out.println(z);
	}

}
