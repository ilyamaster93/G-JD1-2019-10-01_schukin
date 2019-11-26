package by.academy.java.shchukin.classwork.lesson15;

public class Program {

	public static void main(String[] args) {
		final Incremenator incremenatorThread = new Incremenator();
		incremenatorThread.start();

		for (int i = 1; i <= 3; i++) {
			try {
				Thread.sleep(i * 2 * 1000);
			} catch (final InterruptedException e) {
			}
			incremenatorThread.changeAction();
		}
//incremenatorThread.finish();
		incremenatorThread.interrupt();
	}
}
