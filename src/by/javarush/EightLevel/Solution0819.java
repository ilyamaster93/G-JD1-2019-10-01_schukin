package by.javarush.EightLevel;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.*;

/* 
Set из котов
*/

public class Solution0819 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
                 
        Cat tempCats = iterator.next();
        iterator.remove();
        //или вместо 2х верхних строчек
        //if(iterator.hasNext())
          //  cats.remove(iterator.next());
        
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cat = new HashSet<Cat>();
    cat.add(new Cat());
    cat.add(new Cat());
    cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat tempCat : cats)
        System.out.println(tempCat);
    }

    // step 1 - пункт 1
    public static class Cat {
        
    } 
}