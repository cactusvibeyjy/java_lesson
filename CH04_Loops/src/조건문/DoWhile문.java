package 조건문;

public class DoWhile문 {
	public static void main(String[] args) {
		//처음 한번은 조건과 상관없이 실행, 그 이후 참이면 계속 반복
		int count = 0;
		System.out.println("do while 반복문");
		
		do {
			System.out.println("Count: " + count);
		} while (count++<30);
	}

}
