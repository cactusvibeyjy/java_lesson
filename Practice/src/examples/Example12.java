package examples;

public class Example12 {
	public static void main(String[] args) {
		int num = 374;
		int one = num/100;
		int ten = num % 100 /10;
		int hund = num % 10;
		System.out.println("Total : "+ (one+ten+hund) );
	}
}
