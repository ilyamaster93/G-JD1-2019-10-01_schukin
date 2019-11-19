package by.academy.java.shchukin.homework;

import java.io.*;
import java.util.*;

public class One {
	public static void main(String[] args) throws Exception {
		System.out.println("Введите в консоль число:  ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());

		switch (t) {
		case 1: {
			System.out.println("Понедельник");
		}
			break;
		case 2: {
			System.out.println("Вторник");
		}
			break;
		case 3: {
			System.out.println("Среда");
		}
			break;
		case 4: {
			System.out.println("Четверг");
		}
			break;
		case 5: {
			System.out.println("Пятница");
		}
			break;
		case 6: {
			System.out.println("Суббота");
		}
			break;
		case 7: {
			System.out.println("Воскресенье");
		}
			break;
		default: {
			System.out.println("Ошибка, такого дня недели не существует");
		}
		}
	}
}
