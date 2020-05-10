package by.javarush.ThirdteenLevel;
import java.io.*;
//import java.util.Scanner;

/*
1 Прочесть с консоли имя файла.
2 Считывать строки с консоли, пока пользователь не введет строку "exit"
3 Вывести все строки в файл.
*/
public class Solution1319
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( new FileOutputStream(reader.readLine())));

        String next;
        do
        {
            next = reader.readLine();
            writer.write(next);

            if (!next.equals("exit"))
            {
                writer.newLine();
            }
            else break;
        }
        while (!next.equals("exit"));
        reader.close();
        writer.close();
    }
}