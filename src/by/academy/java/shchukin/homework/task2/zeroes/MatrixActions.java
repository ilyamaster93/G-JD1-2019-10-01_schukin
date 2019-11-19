package by.academy.java.shchukin.homework.task2.zeroes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixActions {

	public void rundomize(Matrix matrix, int base) {

		matrix.newMatrix(base);

		for (int row = 0; row < base; row++) {
			double[] randomRow = ThreadLocalRandom.current().doubles((long) base, (double) -base, (double) base)
					.toArray();
			matrix.setRow(row, randomRow);
		}
	}

	public int inputParam(String prompt) {
		Integer base = null;

		Scanner in = new Scanner(System.in);

		while (base == null) {
			try {

				System.out.print(prompt);
				base = in.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Неверный ввод! Попробуйте еще раз.");
				in.next();
			}
		}
		return base;
	}

}