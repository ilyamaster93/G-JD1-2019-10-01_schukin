package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution3 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
        }
        for (int i = array.length-1; i >= 0; i--)
            System.out.println(array[i]);
    }
}
