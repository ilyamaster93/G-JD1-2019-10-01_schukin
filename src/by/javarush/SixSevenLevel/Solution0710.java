package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

/* 
В начало списка
*/

public class Solution0710 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            //list.add(s);
            list.add(0, s) ;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }

    }
}