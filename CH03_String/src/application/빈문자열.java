package application;

public class 빈문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// blank VS. empty:공백을 제외하려면 isBlank를 사용한다.
		String myText = "      \n";
		System.out.println("빈문자열 확인 :" + myText.isEmpty()); //빈문자열만 확인
		System.out.println("빈문자열 확인 :" + myText.isBlank()); //공백제외하고 빈문자열 확인
		
		myText = "아침밥을 맛있게 먹었다.";
		System.out.println(myText.replace("아침", "저녁"));
		
		//공백제거 strip()
		String name = " 제인";
		System.out.printf("'%s'", name.strip());
	}

}
