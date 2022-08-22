package try_catch;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in numbers");
		String line = scanner.nextLine();//문자열 입력(엔터키 전까지 \n)
		
		int number = 0;
		boolean isNumber = false;
		 
		
		try {
			number = Integer.parseInt(line);
			isNumber = true;//숫자가 맞음
			//System.out.println("The entered number is: " + number);
		} catch (NumberFormatException e) {//숫자변환 예외발생시 캐치문실행
			System.out.println("Not a number");
		}
		if(isNumber) {
			System.out.println("The entered number is: " + number);
		}
		
		scanner.close();
		
	}
}
