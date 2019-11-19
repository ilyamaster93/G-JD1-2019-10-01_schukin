package by.academy.java.shchukin.classwork.lesson2;

public class PrimitiveSwapByValue {
	public static void main(final String[] args) {
		final int a = 1;
		final int b = 2;
		System.out.println("before:" + a + " and " + b);
		badSwap(a, b);
		System.out.println("after:" + a + " and " + b);
	}

	public static void badSwap(int a, int b) {
		final int temp = a;
		a = b;
		b = temp;

	}

}
