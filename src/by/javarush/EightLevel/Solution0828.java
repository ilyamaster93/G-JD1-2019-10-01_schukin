package by.javarush.EightLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.*;

/* 
Номер месяца
*/

public class Solution0828 {
	public static void main(String[] args) throws IOException {
		// напишите тут ваш код
		Map<String, Integer> map = new HashMap<>();
		map.put("January", 1);
		map.put("February", 2);
		map.put("March", 3);
		map.put("April", 4);
		map.put("May", 5);
		map.put("June", 6);
		map.put("July", 7);
		map.put("August", 8);
		map.put("September", 9);
		map.put("October", 10);
		map.put("November", 11);
		map.put("December", 12);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String enterMounth = reader.readLine();
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			// получение «пары» элементов
			Map.Entry<String, Integer> pair = iterator.next();

			String mounth = pair.getKey();
			Integer mounthNumber = pair.getValue();
			if (mounth.equals(enterMounth)) {
				System.out.println(mounth + " is the" + mounthNumber + " month");
			}

		}

	}
}