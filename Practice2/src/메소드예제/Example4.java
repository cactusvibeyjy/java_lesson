package 메소드예제;

public class Example4 {

	public static void main(String[] args) {
		double dollar = dice() + dice() +dice();
		double won = exchange(dollar);
		
		System.out.printf("획득 금액: $%.2f(%.0f원)", dollar, won);
	}
	private static double exchange(double dollar) {
		double won = dollar * 1082.25108;
		return won;
	}
	public static int dice() {
		int ran = (int) (Math.random()*6+1);
		return ran;
	}
	
	

}
