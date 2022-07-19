package 조건문;

import java.util.Scanner;

public class 변수범위 {
	public static void main(String[] args) {
		int value = 0;
		System.out.println(value);
	}
	
	{
		for(int i=0; i<4; i++) {
		System.out.println(i);
		//for문 안에 쓰인 변수 i는 밖에서 쓸 수 없음 (지역변수)
		//Scanner scanner = new Scanner(System.in);
	}
		
		Scanner scanner = new Scanner(System.in);
		String input ="";
		do {
			System.out.println("종료하려면 'quit'을 입력하세요");
			input = scanner.nextLine();
		}while(!input.equals("quit"));
		scanner.close();
		}
}
