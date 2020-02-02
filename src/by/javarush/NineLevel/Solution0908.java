package by.javarush.NineLevel;
/* 
Исключение при работе со строками
*/

public class Solution0908 {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
        String s = null;
        String m = s.toLowerCase();
        }
        catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        //напишите тут ваш код
    }
}
