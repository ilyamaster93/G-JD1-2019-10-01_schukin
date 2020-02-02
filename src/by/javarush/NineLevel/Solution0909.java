package by.javarush.NineLevel;
/* 
Исключение при работе с массивами
*/

public class Solution0909 {
    public static void main(String[] args) {
        //напишите тут ваш код
try{
        int[] m = new int[2];
        m[8] = 5;
}
    catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //напишите тут ваш код
    }
}
