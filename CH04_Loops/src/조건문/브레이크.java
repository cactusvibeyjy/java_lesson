package 조건문;

public class 브레이크 {
	public static void main(String[] args) {
		//break 반복문에서 빠져나옴
		int count = 0;
		while (true) {
			System.out.println("헬로우." + count);
			if (count ==5) {
				break;
			}
			System.out.println("how are you?");
			count++;
		}
		System.out.println("end of program");
	}

}
