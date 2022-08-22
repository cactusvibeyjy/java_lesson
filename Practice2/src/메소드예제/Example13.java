package 메소드예제;

public class Example13 {

	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
		
	}
	public static  void printPay(double basepay, int hours) {
		double pay = 0.0;
		if(basepay<8.00) {
			
			System.out.println("최저 시급 에러!");
			return;
			}
		
		else if (hours > 60) {
			System.out.println("초과 근무시간 에러");
			return;
		}
		
		else if (hours > 40){
			pay = (basepay*40)+(basepay*(hours-40));
		}
		else {
			pay = basepay*hours;
		}
			System.out.printf("$%.2f\n", pay);	
		}
		
	}


	