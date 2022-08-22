package 런타임예외;

public class Thermostat {		
	

	public void setTemperature(double t) {
		//throws 예외를 예외를 미뤄서  이 메소드를 부를때 처리
		
		setMachineTemperature(t);
		System.out.println("Set temperature : " +t);
		}

	private void setMachineTemperature(double t) {
		if (t <0 || t >35) {
			//코드로 직접 예외 객체 생성
			//런타임예외는 따로 예외처리를 안해줘도 에러가 발생하지 않는다.
			throw new RuntimeException("The temperature is abnormal.");
		}
	}
}

