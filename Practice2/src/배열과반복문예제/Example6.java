package 배열과반복문예제;

public class Example6 {

	public static void main(String[] args) {
		// int number = Integer.parseInt(args[0]);
		printFactorial(4);

	}

	public static void printFactorial(int n) {
		int result = 1;
		System.out.printf("%d! = ", n);
		for (int i = n; i > 0; i--) {
			System.out.printf(" %d ", i);
			result *= i;
			if (i != 1) {
				System.out.printf("x");
			}

		}
		System.out.printf(" = %d\n", result);
	}

}
