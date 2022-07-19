package 조건문;

import java.util.Scanner;

public class 예제2 {
	public static void main(String[] args) {
		
	
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?");
		System.out.println("3. 프로그램 종료");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("옵션을 선택 >");
		int option = scanner.nextInt();
		scanner.close();
		
		
		switch (option) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕");
			break;
		case 3:
			System.out.println("종료합니다..");
			break;
		case 10000:
			System.out.println("이스터에그를 찾았습니다.");
			break;
		default:
			System.out.println("잘못된 옵션");
			break;
		}
//		
//		if (option ==1) {
//			System.out.println("헬로우");
//		}
//		else if (option ==2) {
//			System.out.println("안녕?");
//		}
//		else if (option == 3) {
//			System.out.println("종료합니다..");
//		}
//		else if (option == 10000) {
//			System.out.println("이스터에그");
//		}
//		else {
//			System.out.println("잘못된 옵션");
//		}
//		
		
		
	}
}
