package by.javarush.TenLevel;
public class Solution1001 {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}