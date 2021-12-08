package custom_exception;

import custom_exception.exceptions.TempOutOfRangeException;
import custom_exception.exceptions.TempTooLowException;

public class Thermostat {
	//예외처리 throw는 해당 예외처리를 이 메소드를 호출할때 처리하도록 함
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		setMachineTemperature(temperature);
		
		System.out.println("온도 세팅 : " + temperature);
	}

	private void setMachineTemperature(double temperature) throws TempOutOfRangeException{
		if(temperature < 0) {
			throw new TempTooLowException("온도가 낮습니다."); // 새 예외를 생
		}
		else if(temperature > 35) {
			throw new TempOutOfRangeException("온도가 높습니다."); // 새 예외를 생
		}
		
	}
}
