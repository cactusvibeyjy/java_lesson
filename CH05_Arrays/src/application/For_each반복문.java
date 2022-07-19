package application;

public class For_each반복문 {

	public static void main(String[] args) {
		// for each 반복문
		
		String[] fruits = {"바나나", "사과", "수박"};
		//fruits는 문자배열이라 타입을 String을 주어야 한다.
		for (String a: fruits) {
			System.out.println(a);
		}

	}

}
