package by.javarush.NineLevel;
import java.util.ArrayList;

/* 
Исключение при работе с коллекциями List
*/

public class Solution0910 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try{
        ArrayList<String> list = new ArrayList<String>();
        String s = list.get(18);
        }
        
        catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}