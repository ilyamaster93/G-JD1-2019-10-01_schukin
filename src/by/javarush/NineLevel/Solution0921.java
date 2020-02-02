package by.javarush.NineLevel;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution0921 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> array = null;;
        try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        array = new ArrayList<Integer>();
        while (true) {
        array.add(Integer.parseInt(reader.readLine()));
        }    
        //return array; 
        }
        catch (NumberFormatException e) {
            for (Integer list: array) {
                System.out.println(list);
            }
        }
        catch (IOException e) {
        }
    }
}
