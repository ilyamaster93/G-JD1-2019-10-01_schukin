package by.javarush.SixSevenLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution0709 {
	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			// String s = reader.readLine();
			list.add(reader.readLine());
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			if (list.get(i).length() < min) {
				min = list.get(i).length();
			}
		}
		System.out.println(min);
		for (int i = 0; i < 5; i++) {
			if (list.get(i).length() == min) {
				System.out.println(list.get(i).length());
			}
		}
	}
}