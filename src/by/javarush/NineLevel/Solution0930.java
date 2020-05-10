package by.javarush.NineLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution0930 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }


    public static void sort(String[] array)
    {
        int k;
        String[] sortArray = new String[array.length];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i+1; j < array.length; j++)
        {
            if (isNumber(array[i])&&isNumber(array[j]))
            {
                    if (Integer.parseInt(array[i])<Integer.parseInt(array[j]))
                    {
                        k = Integer.parseInt(array[i]);
                        array[i] = array[j];
                        array[j] = String.valueOf(k);
                    }
            }
            else if (!isNumber(array[i]) && !isNumber(array[j]))
            {
                    if (isGreaterThan(array[i], array[j]))
                    {
                        String t = array[i];
                        array[i] = array[j];
                        array[j] = t;
                    }
            }
        }}
        //напишите тут ваш код
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
