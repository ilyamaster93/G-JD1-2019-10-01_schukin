package by.javarush.EightLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.*;

/* 
Перепись населения
*/

public class Solution0815 {
	public static Map<String, String> createMap() {
		// напишите тут ваш код
		Map<String, String> map = new HashMap<String, String>();
		map.put("Дима", "Петров");
		map.put("Женя", "Иванов");
		map.put("Алекс", "Михайлов");
		map.put("Оля", "Трасько");
		map.put("Олеся", "Милошевич");
		map.put("Марго", "Радионович");
		map.put("Анастэйша", "Поркурат");
		map.put("Макс", "Черницкович");
		map.put("Вася", "Обломов");
		map.put("Декстер", "Грэй");
		return map;
	}

	static String name = "Грэй";
	static String lastName = "Дима";

	public static int getCountTheSameFirstName(Map<String, String> map, String lastName) {
		// напишите тут ваш код
		int valueCount = 0;

		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			// получение «пары» элементов
			Map.Entry<String, String> pair = iterator.next();
			// map.entrySet().removeIf(e -> e.getValue() < 500);

			if (pair.getValue().equals(lastName))
				valueCount++;
		}
		return valueCount;
	}

	public static int getCountTheSameLastName(Map<String, String> map, String name) {
		// напишите тут ваш код
		int keyCount = 0;

		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			// получение «пары» элементов
			Map.Entry<String, String> pair = iterator.next();
			// map.entrySet().removeIf(e -> e.getValue() < 500);

			if (pair.getKey().equals(name))
				keyCount++;
		}
		return keyCount;
	}

	public static void main(String[] args) {
		System.out.println(getCountTheSameFirstName(createMap(), name));
		System.out.println(getCountTheSameLastName(createMap(), lastName));
	}
}
