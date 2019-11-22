package by.academy.java.shchukin.classwork.lesson14;

public class ThreadRunnerTypeOne {
	public static class HelloThread extends Thread {
		@Override
		public void run() {
			System.out.println("Hello from a thread!");
		}
	}

	public static void main(String[] args) {
		HelloThread helloThread = new HelloThread();
		helloThread.start();
	}
}
