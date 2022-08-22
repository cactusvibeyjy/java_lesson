package 스캐너문제;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		//스캐너 사용중 nextInt  다음에 nextLine 사용시 에러
		Scanner scanner = new Scanner(System.in);
		int num = 0; //초기값은 0
		String str;
		System.out.print("num 입력 =");
		try {
			num = Integer.parseInt(scanner.nextLine());
			
		}catch (NumberFormatException e){
			System.out.println("정수를 입력");
		}
		
		System.out.print("str 입력 = ");
		str = scanner.nextLine();//숫자 입력시 엔터제외하고 앞의 숫자만 가져가서 남은 엔터때문
		
		System.out.println();
		System.out.println("num : " +num);
		System.out.println("str : " +str);
		
		scanner.close();
	}
}
