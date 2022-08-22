package 배열과반복문예제;

//import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		//Integer.parseInt(s)
		double start = Double.parseDouble(args[0]);
		int after = Integer.parseInt(args[1]);
//		Scanner scanner = new Scanner(System.in);
//		double start;
//		int after;
//		start = scanner.nextDouble();
//		after = scanner.nextInt();
		
		double result = weight(start, after);
		
		System.out.printf("%d개월 후 예상 몸무게 => %.2fkg",after, result);
		
	}
	
	public static double weight(double currentWeight, int months) {
		double expectedWeight = currentWeight;
		for(int i =0; i < months; i++) {
			expectedWeight += 0.231;
		}
		return expectedWeight;
	}

}
