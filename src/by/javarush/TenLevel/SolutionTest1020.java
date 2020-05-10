package by.javarush.TenLevel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class SolutionTest1020 {
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer[] array = new Integer[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[1]);
        System.out.println(array[2]);
    }

    public static void sort(Integer[] array) {
        //напишите тут ваш код
    	//1 способ перевода array in arrayList
    	List<Integer> list1 = new ArrayList<Integer>(array.length);
    	Collections.addAll(list1, array);
    	Collections.sort(list1);
    	array = list1.toArray(new Integer[list1.size()]);
    	
    	//for (Integer integ : list1)
            System.out.printf((Arrays.deepToString(array)));
            System.out.println(array[1]);
    	
    	//2 способ перевода array in arrayList  	
    	List<Integer> list2 = Arrays.asList(array);
    	//return array;
    }
}
