package by.academy.java.shchukin.homework.task2;
/*
 + Ввести с консоли n-размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -n до n с помощью генератора случайных чисел (Random), включая числа с дробной частью. 

Выполнить указанные задания и результаты в каждом случае вывести на косоль.
- округлить все элементы матрицы до целого числа
- найти максимальный элемент (ы) в матрице и удалить из матрицы все строки и столбцы, его содержащие.
- уплотнить матрицу, удаляя из нее строки и столбцы, заполненные нулями.
- упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки). значение "k" генерируется рандомно при каждом запуске программы (в границах размерности массива)
- построить матрицу, вычитая из элементов каждой строки матрицы ее среднее арифметическое.
- найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
- транспонировать квадратную матрицу (https://ru.wikipedia.org/wiki/Транспонированная_матрица).
 * */

import java.util.Random;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Введите в консоль число n:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[][] a = new double[n][n];
		// int max, min;
		// Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = ((int) (Math.random() * 2 * n) - n) / 1.1;
			}
		}
		scan.close();
		System.out.println("Первоначальная матрица имеет вид:");
		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println(
				"______________________________________________________________________________________________________________");
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = ((int) (Math.round(a[i][j])));
			}
		}
		scan.close();
		System.out.println("После округления матрица имеет вид:");
		for (int i = 0; i < a.length; i++, System.out.println()) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		System.out.println();
		System.out.println(
				"______________________________________________________________________________________________________________");
		System.out.println();
		
		double max = a[0][0], min = a[0][0];
		double row=0, col=0, newRow=0, newCol=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    row=i;
                    col = j;
                }
                if (min > a[i][j]) {
                    min = a[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Миниимальный элемент массива: " + min);
        
        System.out.println();
		System.out.println(
				"______________________________________________________________________________________________________________");
		System.out.println();
		
		
	}
}
