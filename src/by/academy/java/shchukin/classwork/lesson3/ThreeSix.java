package by.academy.java.shchukin.classwork.lesson3;

import java.util.Random;

public class ThreeSix {

	public static void main(final String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10); // ���������� ���������� ������� �� 0 �� 10 ���� ����� �������
		}
		System.out.println("initial array:");
		printArray(array);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] += 10;
		}
		System.out.println("new array:");
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " "); // ������ ��-�� ����� ������
		}
	}
}
