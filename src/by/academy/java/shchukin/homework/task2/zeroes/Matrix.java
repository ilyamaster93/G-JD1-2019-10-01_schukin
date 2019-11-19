package by.academy.java.shchukin.homework.task2.zeroes;

public final class Matrix {
	private double[][] matrixArr;
	private int size;

	public void newMatrix(int matrixSize) {
		this.matrixArr = new double[matrixSize][matrixSize];
		this.size = matrixSize;
	}

	public int getSize() {
		return size;
	}

	public void setElement(int row, int column, double value) {
		this.matrixArr[row][column] = value;
	}

	public void setRow(int row, double[] arrValue) {
		this.matrixArr[row] = arrValue;
	}

	public void setColumn(int column, double[] colValues) {
		for (int i = 0; i < size; i++) {
			setElement(i, column, colValues[i]);
		}
	}

	public boolean hasZeroFilledRow(int row) {
		for (int i = 0; i < size - 1; i++) {
			if (matrixArr[row][i] != (double) 0) {
				return false;
			}
		}
		return true;
	}

	public Matrix deleteRowAndColumn(int row, int column) {
		Matrix tempMatr = new Matrix();
		tempMatr.newMatrix(size - 1);
		int tempI = 0, tempJ = 0;

		for (int i = 0; i < size; i++) {
			if (i == row - 1) {
				continue;
			}
			for (int j = 0; j < size; j++) {
				if (j == column - 1) {
					continue;
				}
				tempMatr.setElement(tempI, tempJ++, matrixArr[i][j]);
			}
			tempI++;
			tempJ = 0;
		}
		return tempMatr;
	}

	public boolean hasZeroFilledColumn(int col) {
		for (int i = 0; i < size - 1; i++) {
			if (matrixArr[i][col] != (double) 0) {
				return false;
			}
		}
		return true;
	}

	public Matrix compressZeroFilled() {
		int row = -1, col = -1;
		for (int i = 0; i < size; i++) {
			if (hasZeroFilledColumn(i)) {
				col = i;
			}
			if (hasZeroFilledRow(i)) {
				row = i;
			}
			if ((col >= 0) || (row >= 0)) {
				return this.deleteRowAndColumn(row + 1, col + 1).compressZeroFilled();
			}
		}
		return this;
	}
}