package by.javarush.SixSevenLevel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution0720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //System.out.println("Введи размерность листа");
        int N = Integer.parseInt(reader.readLine());
        //System.out.println("Укажи, сколько элементов сдвинуть в конец листа");
        int M = Integer.parseInt(reader.readLine());
        //System.out.println("Заполни лист");
        for (int i = 0; i<N; i++) {
            list.add(reader.readLine());
        }

        for (int i = 0; i<M; i++) {
            list.add(N, list.get(i));
            N++;
        }
               
        for (int i = 0; i<M; i++) {
        	list.remove(0);
        }

        for (String string : list) {
            System.out.println(string);
        }

    }
}
