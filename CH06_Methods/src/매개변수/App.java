package 매개변수;

public class App {
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	int number = 5;
	int result = cal.square(number);
	System.out.printf("%d 의 제곱은 %d 이다 \n", number, result);
	
	result = cal.plus(5, 6);
	System.out.printf("두 수의 합은 %d 이다.\n", result);
	
	int n=5;
	int y=8;
	result = cal.minus(5, 8)
	;
	System.out.printf("%d와 %d의 차는 %d 이다. \n", n, y, result);
	
}
}
