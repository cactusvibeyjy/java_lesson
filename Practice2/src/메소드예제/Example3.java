package 메소드예제;


public class Example3 {
	public static void main(String[] args) {
		
	
		double gas = 8.86;
		double km = 182.736;
		double effi = calEffi(gas, km);
		System.out.printf("연비: %.2f km/L", effi);
	}
		private static double calEffi(double gas, double km) {
			return km/gas;
		}
		
		
		
		
		
		
		
		
		
		
	}

