package application;

public class 반복문과배열 {

	public static void main(String[] args) {
		// for 반복문과 문자열의 인덱스 i를 이용해 문자열의 첫번째부터 끝까지 출력하기
		String[] animals = { "개", "고양이", "닭" };
		

		for (int i = 0; i < animals.length; i++) {
			System.out.printf("인덱스 %d : %s \n", i, animals[i]);
		}

	}

}
