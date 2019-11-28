package by.academy.java.shchukin.classwork.lesson15;

class JoinThread extends Thread {

	public JoinThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		String threadName = getName();
		long timeout = 0;
		System.out.println("Thread start " + threadName);
		try {
			switch (threadName) {
			case "1":
				timeout = 5000;
				break;
			case "2":
				timeout = 1000;
				break;
			}
			Thread.sleep(timeout);
			System.out.println("Thread end " + threadName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
