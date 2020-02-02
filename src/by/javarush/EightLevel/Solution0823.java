package by.javarush.EightLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution0823 {

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String newStr = "";
        boolean space = true;

        for (int i = 0; i < s.length(); i++){

            String sub = s.substring(i, i+1);

            if (!sub.equals(" ")){
                if (space == true)
                    newStr += sub.toUpperCase();
                else
                    newStr += sub;
                space = false;
            }else {
                newStr += sub;
                space = true;
            }
        }

        System.out.println(newStr);
    }
}