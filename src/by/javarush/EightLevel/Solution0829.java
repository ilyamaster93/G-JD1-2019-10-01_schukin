package by.javarush.EightLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.*;
/*
Модернизация ПО
*/

public class Solution0829 {
	public static void main(String[] args) throws IOException {

		Map<String, String> map = new HashMap<>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

		while (true) {
			// получение «пары» элементов
			// Map.Entry<String, String> pair = iterator.next();

			String city = reader.readLine();
			if (city.isEmpty()) {
				break;
			}
			String family = reader.readLine();
			
			map.put(city, family);
		}
		String eCity = reader.readLine();
		reader.close();
		System.out.println(map.get(eCity));

	}
}