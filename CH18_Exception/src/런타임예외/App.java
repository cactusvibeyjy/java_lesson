package 런타임예외;

public class App {
	public static void main(String[] args) {
		//런타임예외는 예외처리를 하지 않아도 에러가 발생하지 않는다.
		
//		try {
//		System.out.println(5/0); //에러메세지만 출력
//		} catch (ArithmeticException e) {
//			System.out.println("Cannot be divided by 0");
//		}
		//throw예외 처리는 불러와서 처리함
		//먼저 객체를 만들어서 메소드를 사용하여야 함
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(0);
		} catch (Exception e) {
			//e.printStackTrace();//예외발생시 빨간색 코드를 보여주는 명령어
			System.out.println(e.getMessage());//에러 메세지만 출력
		}
	}

}
