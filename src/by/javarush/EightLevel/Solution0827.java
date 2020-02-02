package by.javarush.EightLevel;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Работа с датой
*/

public class Solution0827 {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date dataYear = df.parse(date);
        Date raznica = df.parse(date);
         dataYear.setHours(0);
    dataYear.setMinutes(0);
    dataYear.setSeconds(0);
    dataYear.setDate(1);      
    dataYear.setMonth(0); 
long Itog = raznica.getTime() - dataYear.getTime();
       long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
       int dayCount = (int) (Itog/msDay)+1;
       if (dayCount%2!=0) {
       return true;
       }
       else
       return false;
    }
}