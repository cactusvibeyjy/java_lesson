package 커스텀예외.exceptions;

public class TempTooHigh extends TempOutofRangeException {


	private static final long serialVersionUID = 1L;

	public TempTooHigh(String m) {
		super(m);
	}
	

}
