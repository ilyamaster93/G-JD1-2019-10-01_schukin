package by.javarush.ThirdteenLevel;
import java.io.*;

/* 
Чтение файла
*/

public class Solution1318 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        
        InputStream fileInputStream = null;

        try {
            fileInputStream = getInputStream(sourceFileName);
            
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
        }
       
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            char ch = (char) data;
            System.out.print(ch);
        }
                
        fileInputStream.close();
        reader.close();
        
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }
}