package custom_exception.exceptions;

public class TempTooHighException extends TempOutOfRangeException {
	private static final long serialVersionUID = 1L;
	
	public TempTooHighException(String message) {
		super(message); //입력된 메시지로 새 예외 객체 생성
	}
}
