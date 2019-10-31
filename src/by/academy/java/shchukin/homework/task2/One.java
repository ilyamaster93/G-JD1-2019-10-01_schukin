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
		int N = scan2.nextInt();

		if (k <= N) {
			int[] numbers = new int[N];

			for (int i = 0; i < numbers.length; i++) {
				for (int i1 = 0; i1 < k; i1++) {
					numbers[i1] = i1 + 1;
					System.out.print(numbers[i1]);
				}
				System.out.println(" ");	
			}

			

		} else {
			System.out.println("Ошибка. Выход за границы массива");
		}
	}
}
