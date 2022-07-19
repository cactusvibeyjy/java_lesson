package application;

import java.util.Scanner;

public class New배열예제 {

	public static void main(String[] args) {
		final int number = 3;
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int [number];
		
		for(int i=0; i<number; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}
		scanner.close();
		
		System.out.println("입력한 값은: ");
		int total = 0;
		
		for(int i=0; i<number; i++) {
			System.out.println(numbers[i]);
			total += numbers[i];
			
			
		}
		System.out.println("Total: " + total);

	}

}
