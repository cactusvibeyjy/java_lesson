package 조건문;

import java.util.Scanner;

public class 패스워드남은기회 {
	public static void main(String[] args) {
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
		boolean grant = false;
		
		int chance = 3;
		
		String password = "";
		for(int i =1; i <=3; i++) {
			System.out.print("비밀번호 입력>");
			password = scanner.nextLine();
//			
//				
//		if(password.equals(USER_PASSWORD)) {
//			System.out.println("Access granted");
//			grant = true;
//			break;
//			}
	//}
	// else(!password.equals(USER_PASSWORD))
	do

	{
		System.out.printf("chance는 몇%d회 남았슴", --chance);

	}while(!password.equals(USER_PASSWORD));



if(!grant){System.out.println("접속거부");}scanner.close();

}}
