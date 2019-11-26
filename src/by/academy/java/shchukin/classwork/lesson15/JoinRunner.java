package by.academy.java.shchukin.classwork.lesson15;

public class JoinRunner {

	public static void main(String[] args) {
		System.out.println("Start main thread");
		Thread t1 = new JoinThread("1");
		Thread t2 = new JoinThread("2");
		t1.start();
		t2.start();
		try {
			t1.join();//поток main остановлен до окончания работы поткоа t1
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End main thread");

	}

}