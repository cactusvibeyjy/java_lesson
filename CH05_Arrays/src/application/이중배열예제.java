package application;

public class 이중배열예제 {
	public static void main(String[] args) {
		int[][] values = { { 1, 5, 7 }, { 9, 6, 3 }, { 2, 4, 6 }, };
		int total = 0;

		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				total = total + values[i][j];
			}
		}
		System.out.println("Total : " + total);

	}
}
