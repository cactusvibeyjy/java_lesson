package 조건문;

import java.util.Scanner;

public class DoWhile_password체크 {
public static void main(String[] args) {
	final String USER_PASSWORD = "hello";
	Scanner scanner = new Scanner(System.in);
	String password = null;
	
	do {
		System.out.print("Enter password>");
		
		password = scanner.nextLine();
		if(!password.equals(USER_PASSWORD)) {
			System.out.println("Wrong password!");
		
		}
	} while(!password.equals(USER_PASSWORD));
			
	
	
	//System.out.println("Wrong password!");
	
	System.out.println("Access granted");
	scanner.close();
}
}
