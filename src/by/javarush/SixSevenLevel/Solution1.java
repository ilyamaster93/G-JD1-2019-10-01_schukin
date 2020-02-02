package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution1 {
    public static void main(String[] args) throws Exception {
    	int[] array = new int[5];
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());
        array[3] = Integer.parseInt(reader.readLine());
        array[4] = Integer.parseInt(reader.readLine());
        
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j > 0 && array[i] < array[--j]) {
                if (j == 0 || array[i] >= array[j - 1]) {
                    int x = array[i];
                    for (int k = i; k > j; k--)
                        array[k] = array[k - 1];
                    array[j] = x;
                }
            }
        }
        for (int x : array)
            System.out.println(x + " ");
    }
}