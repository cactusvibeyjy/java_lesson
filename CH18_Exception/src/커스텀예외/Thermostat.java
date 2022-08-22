package 커스텀예외;

import 커스텀예외.exceptions.TempOutofRangeException;
import 커스텀예외.exceptions.TempTooHigh;
import 커스텀예외.exceptions.TempTooLowException;

public class Thermostat {		
	

	public void setTemperature(double t) throws TempTooLowException, TempTooHigh  {
		//throws 예외를 예외를 미뤄서  이 메소드를 부를때 처리
		
		setMachineTemperature(t);
		System.out.println("Set temperature : " +t);
		}

	private void setMachineTemperature(double t) throws TempTooLowException, TempTooHigh   {
		if (t <0 ) {
			//코드로 직접 예외 객체 생성
			//런타임예외는 따로 예외처리를 안해줘도 에러가 발생하지 않는다.
			throw new TempTooLowException("The temperature is abnormal.");
		}
		else if (t>35) {
			throw new TempTooHigh("The temperature is abnormal.");
		}
	}
}

