package by.academy.java.shchukin.homework.task2;

import java.util.Scanner;

public class Matrix {

	private double[][] matrixArr;
	private int size;

	public static void main(String[] args) {

		int k;
		double[][] matrix1;

		System.out.println("#Task: find max element of matrix and delete it's row and column.");
		System.out.println("Enter size of matrix:");
		int n2 = (new Scanner(System.in)).nextInt();
		double a2[][] = new double[n2][n2];
		printMatrix(fillMatrix(a2, n2));
		printMatrix(findMaxElement(a2));

		System.out.println("#Task: build matrix with (element - avgOfMatrix) elements.");
		System.out.println("Enter size of matrix:");
		int n1 = (new Scanner(System.in)).nextInt();
		double a1[][] = new double[n1][n1];
		printMatrix(fillMatrix(a1, n1));
		subAvgFromMatrix(a1, avgOfMatrix(a1));
		System.out.println("Changed matrix:");
		printMatrix(a1);

		System.out.println("#Task: transpose matrix.");
		System.out.println("Enter size of matrix:");
		int n = (new Scanner(System.in)).nextInt();
		double a[][] = new double[n][n];
		printMatrix(fillMatrix(a, n));
		printMatrix(transposeMatrix(a));

		System.out.println("#Task: round the elements.");
		System.out.println("Enter size of matrix:");
		int n3 = (new Scanner(System.in)).nextInt();
		double a3[][] = new double[n3][n3];
		printMatrix(fillMatrix(a3, n3));
		printMatrix(roundMatrix(a3));

		System.out.println("#Task: find sum first and second positive numbers on the rows.");
		System.out.println("Enter size of matrix:");
		int n4 = (new Scanner(System.in)).nextInt();
		double a4[][] = new double[n4][n4];
		printMatrix(fillMatrix(a4, n4));
		sumInRows(a4);

		System.out.println("#Task: row sorting.");
		System.out.println("Enter size of matrix:");
		int n5 = (new Scanner(System.in)).nextInt();
		System.out.println("Input row sorting: ");
		k = (new Scanner(System.in)).nextInt();
		double a5[][] = new double[n5][n5];
		printMatrix(fillMatrix(a5, n5));
		System.out.println("Matrix after row sorting: ");
		printMatrix(orderMatrixRows(a5, k));

	}

	public static int[][] fillMatrix(int a[][], int n) {
		System.out.println("Matrix filled with random numbers:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) ((Math.random() * 2 * n - n));
			}
		}
		return a;
	}

	public static double[][] fillMatrix(double a[][], int n) {
		System.out.println("Matrix filled with random numbers:");
		int min = -n;
		int max = n;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				double randomElem = min + (Math.random() * ((max - min)));
				a[i][j] = randomElem;
			}
		}
		return a;
	}

	public static void printMatrix(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%3d ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void printMatrix(double a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.printf("%7.2f ", a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}

	// Rounded given matrix
	public static double[][] roundMatrix(double[][] a) {
		System.out.println("Rounded matrix:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = ((int) (Math.round(a[i][j])));
			}
		}
		return a;
	}

	// Sum first and second positive numbers on the rows

	public static double sumInRows(double a[][]) {
		double generalSum = 0;
		int numEl = a.length;
		for (int i = 0; i < numEl; i++) {
			double lineSum = 0;
			boolean firstNotFound = true;
			boolean secondNotFound = true;
			int j = 0;
			while (secondNotFound && j < numEl) {
				if (a[i][j] > 0) {
					if (firstNotFound) {
						firstNotFound = false;
					} else {
						secondNotFound = false;
					}
				} else if (!firstNotFound) {
					lineSum += a[i][j];
				}
				j++;
			}
			if (!secondNotFound) {
				generalSum += lineSum;
			}
		}
		System.out.println("generalSum: " + generalSum);
		return generalSum;
	}

	// Transposes given matrix
	public static double[][] transposeMatrix(double a[][]) {
		System.out.println("Transposed matrix:");
		double b[][] = new double[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		return b;
	}

	// Calculates average of matrix
	public static double avgOfMatrix(double a[][]) {
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		avg = sum / a.length / a.length;
		System.out.println("Average of matrix = " + avg);
		return avg;
	}

	// Subs average from every elemnt of matrix
	public static double[][] subAvgFromMatrix(double a[][], double avg) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] -= avg;
			}
		}
		return a;
	}

	// Finds max element and deletes it's row and column
	public static double[][] findMaxElement(double[][] a2) {
		double maxValue = 0;
		int maxI = 0;
		int maxJ = 0;
		double b[][] = new double[a2.length - 1][a2.length - 1];
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				if (a2[i][j] > maxValue) {
					maxValue = a2[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		// Deletes column
		for (int i = 0; i < maxI; i++) {
			for (int j = 0; j < maxJ; j++) {
				b[i][j] = a2[i][j];
			}
			for (int j = maxJ; j < a2[i].length - 1; j++) {
				b[i][j] = a2[i][j + 1];
			}
		}

		// Deletes row
		for (int i = maxI; i < a2.length - 1; i++) {
			for (int j = 0; j < maxJ; j++) {
				b[i][j] = a2[i + 1][j];
			}
			for (int j = maxJ; j < a2[i].length - 1; j++) {
				b[i][j] = a2[i + 1][j + 1];
			}
		}
		System.out.println("Maximum value=" + maxValue + ", maxI=" + maxI + ", maxJ=" + maxJ);
		return b;
	}

	// Order matrix rows
	private static double[][] orderMatrixRows(double[][] a5, int col) {

		if (isNull(a5) || col < 1 || col > a5.length) {
			throw new IllegalArgumentException();
		}

		double[][] m = a5.clone();

		for (int i = 0, aLength = a5.length; i < aLength - 1; i++) {
			for (int j = i + 1; j < aLength; j++) {
				if (m[i][col - 1] > m[j][col - 1]) {
					m = shiftRows(m, i, j);
				}
			}
		}

		return m;
	}

	private static double[][] shiftRows(double[][] a5, int row1, int row2) {

		if (isNull(a5) || row1 > a5.length - 1 || row2 > a5.length - 1) {
			throw new IllegalArgumentException();
		}

		double[][] m = a5.clone();

		double t[] = m[row1];
		m[row1] = m[row2];
		m[row2] = t;

		return m;
	}

	private static boolean isNull(double[][] a) {
		return (a == null);
	}

	private static boolean isNull(double[] a) {
		return (a == null);
	}

}
