package 예외던지기;

public class App {
	public static void main(String[] args) throws Exception {
		//throw예외 처리는 불러와서 처리함
		//먼저 객체를 만들어서 메소드를 사용하여야 함
		Thermostat stat = new Thermostat();
		stat.setTemperature(60);
	}

}
