package 메소드예제;

public class Example2 {

	public static void main(String[] args) {
//		double result = calorieCalculator(5000);
//		System.out.println("소모칼로리: " +result+ "kcal");}
//	public static double calorieCalculator(int walk) {
//		return walk *0.02;
//	}		
		int n=3;
		double result = calorieCalculator(n);
		System.out.printf("삼겹살 %d인분: %.2f kcal", n, result);
	}
		
		public static double calorieCalculator(int total) {
			return total*180*5.179;
		}
		
	

}
