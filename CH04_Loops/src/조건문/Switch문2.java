package 조건문;

import java.util.Scanner;

public class Switch문2 {
	public static void main(String[] args) {
		System.out.print("계속진행하겠습니까? (y/n):");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine(); //뭄ㄴ자열 한줄 입력받음
		scanner.close();
		
		switch (input) {
		case "y":
			System.out.println("진행 합니다...");
			break;
		case "n":
			System.out.println("종료 합니다...");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
