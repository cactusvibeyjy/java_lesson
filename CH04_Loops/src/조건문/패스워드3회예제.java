package 조건문;

import java.util.Scanner;

public class 패스워드3회예제 {
	public static void main(String[] args) {
		
		final String USER_PASSWORD = "hello";
		//System.out.print("Enter password >");
		Scanner scanner = new Scanner(System.in);
		boolean accessOK = false;
		
		
		String password ="";
		for(int i =1; i <=3; i++) {
			System.out.print("비밀번호 입력>");
			password = scanner.nextLine();
				if(password.equals(USER_PASSWORD)) {
					System.out.println("접속승인");
					accessOK = true;
					break;
					}
				else {
					System.out.println("틀린 비밀번호");
				
					}
				
		}
					
				
				
				
		
		
		if (!accessOK) {
			System.out.println("접속거부");
		}
		scanner.close();
		}}
