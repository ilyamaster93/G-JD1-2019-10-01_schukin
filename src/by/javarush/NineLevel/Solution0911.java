package by.javarush.NineLevel;
import java.util.HashMap;

/* 
Исключение при работе с коллекциями Map
*/

public class Solution0911 {
    public static void main(String[] args) {
        //напишите тут ваш код
try{
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
}
        catch (NullPointerException e) {
            System.out.println(e);
        }    
        

        //напишите тут ваш код
    }
}
