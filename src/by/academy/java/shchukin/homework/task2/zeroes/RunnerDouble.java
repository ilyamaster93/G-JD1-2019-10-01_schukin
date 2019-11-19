package by.academy.java.shchukin.homework.task2.zeroes;

public class RunnerDouble {
	public static void main(String[] args) {

		String prompt = "Введите целое число n (размер матрицы n*n и база для случайных чисел) и нажмите Enter: ";

		// Create MatrixActions
		MatrixActions act = new MatrixActions();

		// Create Matrix
		Matrix matr = new Matrix();

		// Get size of matrix from input
		int sizeMatix;
		do {
			sizeMatix = act.inputParam(prompt);
			if (sizeMatix <= 0) {
				System.out.println("Неверный размер матрицы. Попробуйте еще раз.");
			}
		} while (sizeMatix <= 0);

		// Initialize matrix with random int
		act.rundomize(matr, sizeMatix);

		System.out.println(matr.toString());

		// Уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
		double[] emptyArray = new double[sizeMatix]; // array to fill rows and columns with zeros
		matr.setRow(sizeMatix / 2, emptyArray); // filling mid row/column
		matr.setColumn(sizeMatix / 2, emptyArray);
		matr.setRow(sizeMatix - 1, emptyArray); // filling last row/column
		matr.setColumn(sizeMatix - 1, emptyArray);

		System.out.println("#Task. Condense the matrix by removing rows and columns filled with zeros.");
		System.out.println(matr.toString()); // to compare
		System.out.println(matr.compressZeroFilled()); // result
	}

}