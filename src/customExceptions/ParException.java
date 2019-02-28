package customExceptions;

public class ParException extends Exception{

	public final static String PAR = "PAR";
	
	private String customMessage;
	private String typeOfOut;
	public ParException(int x) {
		super("size can't be par");
		parOrImpar(x);
		customMessage = "The size is "+typeOfOut;
	}
	private void parOrImpar(int y) {
		if(y%2 == 0) {
			typeOfOut = "PAR";
		}
	}
	@Override
	public String getMessage() {
		String msg;
		msg = super.getMessage() + customMessage;
		return msg;
	}
}
