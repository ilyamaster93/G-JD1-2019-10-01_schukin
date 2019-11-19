package by.academy.java.shchukin.classwork.lesson3;

public class ThreeSeven {

	public static void main(final String[] args) {
		int[] a = new int[] { 1, 3, 4, 5 };

		printWithFor(a);
		printWithForEach(a);
	}

	private static void printWithFor(int[] a) { // For
		for (int i = 0; i < a.length; i++) {
			int j = a[i]; // ����� ����� ��������� �������� � i-� ��������� �������, ����� �������
			System.out.println(j);
		}
	}

	private static void printWithForEach(int[] a) { // ForEach
		for (int j : a) { // ������ ��������� �� ������� �������� �� ����������, ����������
			System.out.println(j);
		}
	}

}
