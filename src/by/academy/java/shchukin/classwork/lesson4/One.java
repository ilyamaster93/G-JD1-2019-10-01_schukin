package by.academy.java.shchukin.classwork.lesson4;

public class One {

	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		test2();
	}

	private static void test2() {
		test3();
	}

	private static void test3() {
		System.out.println("I'm in the top of stack");
		System.out.println("");
	}
}
