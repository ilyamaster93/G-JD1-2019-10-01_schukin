package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution4 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length-2; i++)
        {
            list[i] = reader.readLine();
        }

        for (int i = list.length-3; i >= 0; i--)
            System.out.println(list[i]);

    }
}