package 커스텀예외;

import 커스텀예외.exceptions.TempOutofRangeException;
import 커스텀예외.exceptions.TempTooHigh;
import 커스텀예외.exceptions.TempTooLowException;

public class App {
	public static void main(String[] args) {
		//런타임예외는 예외처리를 하지 않아도 에러가 발생하지 않는다.
		//throw예외 처리는 불러와서 처리함
		//먼저 객체를 만들어서 메소드를 사용하여야 함
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(36);
		} catch (TempTooLowException e) {
			System.out.println("Abnormal! The temperature is lesser than 0");
		} catch (TempTooHigh e) {
			System.out.println("Abnormal! The temperature is greater than 35");
		}
	}

}
