package try_catch;

import java.util.Scanner;

public class App2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int number = getNumber();
		
			System.out.println("The entered number is: " + number);
			scanner.close();
		}
	
	/**
	 * 스캐너를 숫자를 입력받아서 리턴함
	 * @return 입력받은 정수를 리턴
	 */

	private static int getNumber() {
		
		int number = 0;
		boolean isNumber = false;
		
		do {
		
			System.out.println("Enter in numbers");
			String line = scanner.nextLine();//문자열 입력(엔터키 전까지 \n)
			 
			
			try {
				number = Integer.parseInt(line);
				isNumber = true;//숫자가 맞음
				//System.out.println("The entered number is: " + number);
			} catch (NumberFormatException e) {//숫자변환 예외발생시 캐치문실행
				System.out.println("Not a number");
			}
		}while(!isNumber);
		return number;
	}
		
}
