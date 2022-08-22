package 메소드예제;

public class Newline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
		
	}

	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
	}

	private static void oneLine() {
		System.out.println(">");
	}

}
