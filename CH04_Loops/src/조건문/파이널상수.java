package 조건문;

public class 파이널상수 {
	public static void main(String[] args) {
		//final 붙은 변수 => 상수
		final int VALUES = 9; //상수는 전체문자를 대문자로; 값 변환 안됨 수정불가
		System.out.println(VALUES);
		
		final String USER_PASSWORD = "abc";
		//USER PASSWORD = "ABCDEFGH"; -> 수정불가
		System.out.println(USER_PASSWORD);
	}

}
