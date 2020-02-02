package by.javarush.NineLevel;
/* 
Исключение при работе с числами
*/

public class Solution0912 {
    public static void main(String[] args) {
        //напишите тут ваш код
try{
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
}
catch (NumberFormatException e) {
            System.out.println(e);
        }

        //напишите тут ваш код
    }
}
