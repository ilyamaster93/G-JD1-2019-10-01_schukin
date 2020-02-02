package by.javarush.NineLevel;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution0926 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> intList = new ArrayList();
        int [] listOne = {4,5,2,2,4};
        int [] listTwo = {2,2};
        int [] listThree = {5,2,2,4};
        int [] listFour = {1,5,4,5,2,2,4};
        int [] listFIve = new int [0];
        intList.add(listOne);
        intList.add(listTwo);
        intList.add(listThree);
        intList.add(listFour);
        intList.add(listFIve);
        return intList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
