package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution0715 {
    public static void main(String[] args) {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");
        
        for (int i = 0; i < list.size(); i = i + 2) {
        	list.add(i+1, "именно");
        }
        for (int i = 0; i <= list.size()-1; i++) {
            System.out.println(list.get(i));
        }
    }
}