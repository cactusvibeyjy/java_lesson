package 조건문;

import java.util.Scanner;

public class if문 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("사과의 갯수는 :");
		int apples = scanner.nextInt();
		System.out.printf("바나나 갯수는 :");
		int bananas = scanner.nextInt();
		scanner.close();

//		
//		if(apples > bananas) {
//			System.out.println("사과가 바나나보다 많음");
//		}
//		if(bananas > apples) {
//			System.out.println("바나나가 사과보다 많음");
//		}
//		else {
//			System.out.println("바나나와 사과의 개수가 같음");

		//}
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if (apples < bananas) {
			System.out.println("바나나가 사과보다 많음");
		}
		else {
			System.out.println("바나나와 사과의 개수가 같음");
		}
		
		
		System.out.println("프로그램 종료");

	}

}
