package by.javarush.NineLevel;

/* 
Деление на ноль
*/

public class Solution0919 {

    public static void main(String[] args) {
        try {
        divideByZero();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void divideByZero()  {
        int a=5/0;
        System.out.println(a);
    }
}
