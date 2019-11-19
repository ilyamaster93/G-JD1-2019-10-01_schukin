package by.academy.java.shchukin.classwork.lesson11;

public class Test {

	public static void main(String[] args) {
		System.out.println("main:start");
		method1();
		System.out.println("main:end");
	}

	private static void method1() {
		System.out.println("method1:start");
		try {
			method2();
			System.out.println("method1: AFTER METHOD2");
		} catch (MyException1 e) {
			System.out.println("method1: inside catch");
			e.printStackTrace();
			// throw new RuntimeException();
		} catch (MyException2 e) {
			System.out.println("method1: inside catch");
			e.printStackTrace();
		} finally {
			System.out.println("method1: finally");
		}
		System.out.println("method1:end");
	}

	private static void method2() throws MyException1, MyException2 {
		System.out.println("method2:start");

		if (true) {
			throw new MyException1(); // CHECKED
		}

		if (true) {
			throw new MyException2(); // CHECKED
		}

		System.out.println("method2:end");
	}
}