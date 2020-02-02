package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution0712 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        int minLenght=Integer.MAX_VALUE;
        int maxLenght=Integer.MIN_VALUE;
        int minLenghtIndex=0;
        int maxLenghtIndex=0;
        
        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < minLenght) {
                minLenght = list.get(i).length();
                minLenghtIndex=i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() > maxLenght) {
                maxLenght = list.get(i).length();
                maxLenghtIndex=i;
            }
        }
        
        if (minLenghtIndex<maxLenghtIndex) {
            System.out.println(list.get(minLenghtIndex));
        }
        else {
            System.out.println(list.get(maxLenghtIndex));
        }
    }
}