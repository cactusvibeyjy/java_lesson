package 커스텀예외.exceptions;

public class TempTooLowException extends TempOutofRangeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TempTooLowException(String m) {
		super(m);
	}

}
