package 예외던지기2;

public class App {
	public static void main(String[] args) {
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
