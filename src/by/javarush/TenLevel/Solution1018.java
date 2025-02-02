package by.javarush.TenLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Поправочки нужны
Задача: Программа демонстрирует работу HashMap: вводит с клавиатуры набор пар (номер и строку), помещает их в HashMap и выводит на экран содержимое HashMap.

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Программа должна выводить текст на экран.
3. Класс Solution должен содержать три переменные.
4. Программа должна помещать в HashMap 10 пар считанных с клавиатуры.
5. Программа должна выводить на экран содержимое HashMap. Каждое значение с новой строки.
*/

public class Solution1018 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public Solution1018() {
        this.map = new HashMap<Integer, String>();
       // map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        Solution1018 solution = new Solution1018();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
        	Integer index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}