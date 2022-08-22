package 커스텀예외.exceptions;

public class TempOutofRangeException extends Exception {

	private static final long serialVersionUID = 1L;
	public TempOutofRangeException(String m) {
	super(m); //예외 메세지 생성
	}

}
