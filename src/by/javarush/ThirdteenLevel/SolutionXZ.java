package by.javarush.ThirdteenLevel;
import java.io.*;


/* 
Чтение файла
*/

public class SolutionXZ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        reader.close();
        FileInputStream inStream = new FileInputStream(path);
        while(inStream.available() > 0){
            int data = inStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }
        inStream.close();
    }
}