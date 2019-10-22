package task1;

import java.util.Scanner;

public class Two {
	/*
	 * 1.Ввести n целых чисел через консоль, получив таким образом массив. Далее
	 * разработать методы и поочередно вызвать их для выполнения следующих *
	 * алгоритмов: - вывести на консоль самое короткое и самое длинное число, а
	 * также их длину. если чисел с одинаковой длиной несколько - вывести первое по
	 * очереди - вывести на консоль те числа, длина которых меньше (больше) средней,
	 * а также длину - вывести на консоль количество чисел, содержащих только четные
	 * цифры - вывести на консоль числа, которые делятся на 3 или на 5 - вывести на
	 * консоль простые числа (делятся без остатка только на 1 и само на себя) -
	 * вывести на консоль первое число, цифры в котором идут в строгом порядке
	 * возрастания - вывести на консоль первое число-палиндром (одинаково читающееся
	 * в обоих направлениях. Например, число 404)
	 */

	public static void main(String[] args) throws Exception {
		System.out.println("Введите в консоль число (количество чисел числового массива):");
		Scanner scan = new Scanner(System.in);
		int chislo = scan.nextInt();

		int massiv[] = new int[chislo];
		int numbers[] = new int[chislo];
		System.out.println();
		System.out.println("Введите в консоль числа:");
		for (int i = 0; i < chislo; i++) {
			massiv[i] = scan.nextInt();
			numbers[i] = (massiv[i] + "").length();
		}

		numbersLength(massiv, numbers, chislo);
		average(massiv, numbers, chislo);
		evens(massiv);
		delitelThreeOrFive(massiv, chislo);
		prostie(massiv, chislo);
		increasingNumbers(massiv, numbers, chislo);
		palindrome(massiv, numbers, chislo);
	}

	private static void numbersLength(int[] massiv, int[] numbers, int chislo) {
		int max = numbers[0], min = numbers[0], biggest = 0, smallest = 0;
		for (int i = 1; i < chislo; i++) {
			int j = numbers[i];
			if (min > j) {
				min = j;
				smallest = i;
			} else {
				if (max < j) {
					max = j;
					biggest = i;
				}
			}
		}
		System.out.println();
		System.out.println("________________________________________________________________");
		System.out.println();
		System.out.println("Cамое короткое число: " + massiv[smallest] + "," + " длина числа: " + min + ";");
		System.out.println("Cамое длинное число: " + massiv[biggest] + "," + " длина числа: " + max + ";");
		System.out.println();
		System.out.println("________________________________________________________________");
	}

	private static void average(int[] massiv, int[] numbers, int chislo) {
		float value = 0;
		for (int i = 0; i < chislo; i++) {
			value = value + numbers[i];
		}
		value = value / chislo;
		System.out.println();
		System.out.print("Числа, длина которых меньше средней: ");
		System.out.println();
		for (int i = 0; i < chislo; i++) {
			if (value > numbers[i]) {
				System.out.println("Число: " + massiv[i] + "," + " длина числа: " + numbers[i] + ";");
				System.out.println();
			}
		}
		System.out.print("Числа, длина которых больше средней: ");
		System.out.println();
		for (int i = 0; i < chislo; i++) {
			if (value < numbers[i]) {
				System.out.println("Число: " + massiv[i] + "," + " длина числа: " + numbers[i] + ";");
				System.out.println();
			}
		}
	}

	private static void evens(int[] massiv) {
		int value = 0;
		for (int i = 0; i < massiv.length; i++) {
			int element = massiv[i];
			if ((element % 2 == 0) && (element >= 22)) {
				int c = 0;
				int cW = 0;
				while (element != 0) {
					if (element % 2 == 0) {
						c = c + 1;
					}
					element = element / 10;
					cW = cW + 1;
				}
				if (c == cW) {
					value = value + 1;
				}
			}
		}
		System.out.println("________________________________________________________________");
		System.out.println();
		System.out.println("Количество чисел, содержащих только четные цифры: " + value + ";");
		System.out.println();
		System.out.println("________________________________________________________________");
	}

	private static void delitelThreeOrFive(int[] massiv, int chislo) {
		for (int i = 0; i < chislo; i++) {
			if ((massiv[i] % 3 == 0) || (massiv[i] % 5 == 0)) {
				System.out.println();
				System.out.print((i + 1) + "-е число делится на 3 или на 5: ");
				System.out.print(massiv[i] + "; ");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("________________________________________________________________");
	}

	private static void prostie(int[] massiv, int chislo) {
		int value;
		boolean b = false;
		for (int i = 0; i < chislo; i++) {
			if ((massiv[i] != 1) && ((massiv[i] != 2))) {
				for (value = 2; value <= massiv[i]; value++) {
					if (massiv[i] % value != 0) {
						b = true;
					} else {
						b = false;
						break;
					}
				}
			} else {
				b = true;
			}
			if (b) {
				System.out.println();
				System.out.println("Число " + massiv[i] + " является простым числом;");
				b = false;
			} else {
				System.out.println();
				System.out.println("Число " + massiv[i] + " не является простым числом;");
			}
		}

		System.out.println();
		System.out.println("________________________________________________________________");
		System.out.println();
	}

	private static void increasingNumbers(int[] massiv, int[] numbers, int chislo) {
		int p;
		boolean b;
		for (int i = 0; i < chislo; i++) {
			int k = 0;
			b = false;
			int[] array1 = new int[numbers[i]];
			p = massiv[i];
			while (p != 0 && p > 11) {
				array1[k] = p % 10;
				p = p / 10;
				if (array1[k] > p % 10) {
					b = true;
				} else {
					b = false;
					break;
				}
				k++;
			}
			if (b == true) {
				System.out.println("Число, цифры в котором идут в строгом порядке возрастания: " + massiv[i] + ";");
				System.out.println();
			} else {
				System.out.println("В " + (i + 1)
						+ "-й ячейке массива число, цифры в котором идут в строгом порядке возрастания - не найдены;");
				System.out.println();
			}
		}
		System.out.println("________________________________________________________________");
	}

	private static void palindrome(int[] massiv, int[] numbers, int chislo) {
		int j;
		boolean b = false;
		for (int i = 0; i < chislo; i++) {
			int k = 0;
			j = massiv[i];
			int[] array1 = new int[numbers[i]];
			while (j != 0) {
				array1[k] = j % 10;
				j = j / 10;
				k++;
			}
			j = array1.length - 1;
			for (k = 0; k < j; k++) {
				if (array1[k] == array1[j]) {
					b = true;
				} else {
					b = false;
					break;
				}
				j--;
			}
			if (b) {
				System.out.println();
				System.out.println("Число-палиндром: " + massiv[i] + ".");
				System.out.println();
				break;
			}
		}
		if (b == false) {
			System.out.println();
			System.out.println("Число-палиндром не найдено.");
			System.out.println();
		}
	}
}

