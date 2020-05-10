package by.javarush.ThirdteenLevel;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution1326 {
    public static void main(String[] args) {
        // напишите тут ваш код
    	ArrayList<Integer> vect = new ArrayList<>();
    	try (BufferedReader conReader = new BufferedReader(new InputStreamReader (System.in))) {
            
        String fileName = conReader.readLine();
        String fullFileName = "e:\\" + fileName + ".txt";

        try {
            BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(fullFileName))));

            while (fileReader.ready()) {
                vect.add(Integer.parseInt(fileReader.readLine()));
            }
            fileReader.close();
        }
        finally {}
        /*
        catch (FileNotFoundException e){
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("Can't read File");
        }
        */

        Collections.sort (vect);

        for (Integer i : vect) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    	}
    	catch (FileNotFoundException e1){
            System.out.println("File Not Found!");
        }
    	catch (IOException e1) {
            System.out.println("Can't read File");
        }
    	catch (NumberFormatException e1) {
            System.out.println("Can't read File because this format...");
        }

    } 
    }
