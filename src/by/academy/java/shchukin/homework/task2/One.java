package by.academy.java.shchukin.homework.task2;

/*
 * Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз, где k и N вводятся пользователем через консоль


 * */
import java.io.*;
import java.util.*;

public class One {
	public static void main(String[] args) throws Exception {
		System.out.println("Введите в консоль число k:");
		Scanner scan1 = new Scanner(System.in);
		int k = scan1.nextInt();
		System.out.println("Введите в консоль число N:");
		Scanner scan2 = new Scanner(System.in);
		int n = scan2.nextInt();
		double[][] a = new double[n][n];
		int x = 1;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (x + (int) (Math.random() * k));
			}
		}

		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

	}
}
