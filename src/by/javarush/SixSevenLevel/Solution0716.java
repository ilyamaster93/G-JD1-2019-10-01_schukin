package by.javarush.SixSevenLevel;

import java.util.ArrayList;

public class Solution0716 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("роза");
		strings.add("лоза");
		strings.add("лира");
		strings = fix(strings);

		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println(strings.size());
	}

	public static ArrayList<String> fix(ArrayList<String> strings) {
		// напишите тут ваш код
		for (int i = 0; i < strings.size();) {
			if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
				strings.add(i + 1, strings.get(i));
				i = i + 2;
			}
			if (strings.get(i).contains("р") && !strings.get(i).contains("л")) {
				strings.remove(i);
			} else {
				i++;
			}
		}
		return strings;
	}
}