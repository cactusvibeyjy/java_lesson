package 예외던지기;

public class Thermostat {		
	

	public void setTemperature(double t) throws Exception {
		//throws 예외를 예외를 미뤄서  이 메소드를 부를때 처리
		if (t <0 || t >35) {
				//코드로 직접 예외 객체 생성
				throw new Exception("The temperature is abnormal");
			}
		System.out.println("Set temperature : " +t);
		}
	}

