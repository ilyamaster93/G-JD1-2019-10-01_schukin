package by.academy.java.shchukin.classwork.lesson14;

class ExceptThread extends Thread {
	@Override
	public void run() {
		boolean flag = true;
		if (flag) {
			throw new RuntimeException();
		}
		System.out.println("End of ExceptionThread");
	}
}

public class One {
	public static void main(String[] args) throws InterruptedException {
		new ExceptThread().start();
		Thread.sleep(1000);
		System.out.println("end of main");
	}

}
