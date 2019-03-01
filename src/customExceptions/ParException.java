package customExceptions;

@SuppressWarnings("serial")
public class ParException extends Exception{
	public final static String PAR = "PAR";
	/*
	 * This attribute contains the custom message of the custom exception
	 */
	private String customMessage;
	/*
	 * This attribute is for kwon the type of exception
	 */
	private String typeOfOut;
	/*
	 * This attribute is change the super of the exception
	 * 
	 */
	public ParException(int x) {
		super("size can't be par");
		parOrImpar(x);
		customMessage = "The size is "+typeOfOut;
	}
	public void parOrImpar(int y) {
		if(y%2 == 0) {
			typeOfOut = PAR;
		}
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Throwable#getMessage()
	 * This attribute is for get the message of the supper
	 */
	@Override
	public String getMessage() {
		String msg;
		msg = super.getMessage() + customMessage;
		return msg;
	}
}
