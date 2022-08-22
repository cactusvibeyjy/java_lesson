package 메소드예제;

public class Example12 {

	public static void main(String[] args) {
		String x = rating(4.2, 4.3, 4.7);
		String y = rating(3.5, 4.3, 4.8);
		String z = rating(3.1, 3.4, 3.7);
		System.out.printf("X->%s등급\n", x);
		System.out.printf("Y->%s등급\n", y);
		System.out.printf("Z->%s등급\n", z);
	}
	
	public static String rating(double personality, double look, double ability) {
		String rating = "";
		double sum = personality + look + ability;
		if (personality >= 4.0 && look >= 4.0 && ability >=4.0) {
			rating = "A";
		}
		else if (sum >= 10 && (personality>=4.0||look>=4.0||ability >= 4.0)) {
			rating = "B";
		}
		else {
			rating = "C";
		}
		return rating;
	}

}
