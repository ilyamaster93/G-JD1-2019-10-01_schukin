package by.javarush.SixSevenLevel;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Что за список такой?
*/

public class Solution0707 {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Buenos Aires", "Córdoba", "La Plata", "Jack", "Daniels"));

               System.out.println(list.size());

        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }


    }
}