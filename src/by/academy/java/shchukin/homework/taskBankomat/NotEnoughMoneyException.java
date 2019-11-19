package by.academy.java.shchukin.homework.taskBankomat;

public class NotEnoughMoneyException extends Exception {

	public NotEnoughMoneyException(String message) {
		super(message);
	}

	public NotEnoughMoneyException() {
		super();
	}
}