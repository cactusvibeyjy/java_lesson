package application;

public class 이중배열 {
	public static void main(String[] args) {
		//배열안에 배열이 들어간다
	
		String[][]texts = {
				{"one", "two", "three"},
				{"four", "five", "six"},
				{"seven", "eight", "nine"},
		};
		for(int i=0; i < texts.length; i++) {
			//String[] innerArray = texts[i];
			for (int j=0; j < texts[i].length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}
			System.out.println();
	}

}}
