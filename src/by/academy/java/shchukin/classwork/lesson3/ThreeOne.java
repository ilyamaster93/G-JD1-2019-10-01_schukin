package by.academy.java.shchukin.classwork.lesson3;

public class ThreeOne {

	public static void main(String[] args) {
		if (printAndReturnFalse() || printAndReturnTrue()) {
			System.out.println("result: TRUE");
		} else {
			System.out.println("result: FALSE");
		}
	}

	private static boolean printAndReturnTrue() {
		System.out.println("result: TRUE");
		return true;
	}

	private static boolean printAndReturnFalse() {
		System.out.println("result: FALSE");
		return false;
	}

}
