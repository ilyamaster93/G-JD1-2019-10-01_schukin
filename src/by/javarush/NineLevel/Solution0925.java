package by.javarush.NineLevel;

/* 
Статики не на своем месте
*/

public class Solution0925 {
    public static int A = 5;
    public static int B = 2 * A;
    public int C = A * B;
    public static int D = A * B;

    public static void main(String[] args) {
        Solution0925 room = new Solution0925();
        room.A = 5;

        Solution0925.D = 5;
    }

    public int getA() {
        return A;
    }

}
