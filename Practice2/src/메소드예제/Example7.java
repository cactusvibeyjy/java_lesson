package 메소드예제;

public class Example7 {

	public static void main(String[] args) {
		double tomVocal = 8.8;
		double tomDance = 7.8;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과: %s\n", test(kateVocal, kateDance));
	}
	public static String test(double vocal, double dance) {
		String test = null;
		if (vocal* dance >=70.0) {
		test = "합격";
	}
		else {
			test = "불합격";
		}
		return test;

}
}
