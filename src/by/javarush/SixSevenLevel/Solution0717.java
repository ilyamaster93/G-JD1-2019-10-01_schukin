package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution0717 {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (int i = 0; i <= list.size()-1; i++) {
            System.out.println(list.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i = i + 2) {
            list.add(i+1, list.get(i));
        }
        return null;
    }
}