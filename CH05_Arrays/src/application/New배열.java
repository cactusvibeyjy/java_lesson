package application;

public class New배열 {

	public static void main(String[] args) {
		// New 키워드로 배열 생성
		//int[] numbers = {}; 초기값을 바로 넣는 방법
		
		int[] numbers = new int [3]; //int형 3개의 칸을 만든다
	
		for (int i =0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
