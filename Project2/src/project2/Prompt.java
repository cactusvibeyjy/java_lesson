package project2;

import java.util.Scanner;

public class Prompt {
	static Scanner keyboardScan = new Scanner(System.in);
	
	public static String toString (String title) {
		System.out.print(title);
		return keyboardScan.nextLine();
	}
	
	public static int inputInt(String title) {
		return Integer.parseInt(toString(title));
	}
	
	public static void clase() {
		keyboardScan.close();
	}
}
