package by.javarush.SixSevenLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution07071 {
	public static void main(String[] args) throws IOException {
		// напишите тут ваш код
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {
			String s = reader.readLine();
			list.add(s);
		}
		System.out.println(list.size());

		for (int i = 0; i < 5; i++) {
			System.out.println(list.get(i));
		}

	}
}