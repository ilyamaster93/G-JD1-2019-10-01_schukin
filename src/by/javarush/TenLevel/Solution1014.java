package by.javarush.TenLevel;
/* 
Расставьте минимум static-ов
*/

public class Solution1014 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        Solution1014 solution = new Solution1014();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution1014.D = 5 * D * C;

        Solution1014.D = 5;
    }

    public int getA() {
        return A;
    }

}