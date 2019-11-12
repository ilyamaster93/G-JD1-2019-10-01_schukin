package by.academy.java.shchukin.classwork.lesson11;

public class MyRuntimeException extends RuntimeException {

	public MyRuntimeException() {
		super();
	}

	public MyRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public MyRuntimeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
