package by.javarush.TenLevel;

import java.io.BufferedReader;

import java.io.InputStreamReader;
 
/* Задача по алгоритмам
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
Пояснение:
Самое минимальное число – 1-е минимальное.
Следующее минимальное после него – 2-е минимальное
Пример:
1 6 5  7  1  15   63   88
Первое минимальное – 1
Второе минимальное – 1
Третье минимальное – 5
Четвертое минимальное – 6
*/
 
public class Solution1020
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }
 
        sort(array);
 
        System.out.println(array[9]);
        System.out.println(array[10]);
    }
 
    public static void sort(int[] array)
    {
        //Напишите тут ваш код
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}