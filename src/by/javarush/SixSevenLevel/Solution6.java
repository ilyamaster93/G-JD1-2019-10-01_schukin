package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = reader.readLine();
        }
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = list[i].length();
        }
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}