package 런타임예외;

import java.util.Scanner;

public class NullpointException {
	public static void main(String[] args) {
		Scanner scanner = null; //객체를 만들지 않고 눌값을 입력
		scanner.nextLine();
		scanner.close();
		
	}
}
