package by.javarush.NineLevel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution0927 {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Том", new Cat("Том"));
        map.put("Джек", new Cat("Джек"));
        map.put("Киса", new Cat ("Киса"));
        map.put("Дымка", new Cat("Дымка"));
        map.put("Рыжик", new Cat("Рыжик"));
        map.put("Мурка", new Cat("Мурка"));
        map.put("Муся", new Cat("Муся"));
        map.put("Мурзик", new Cat("Мурзик"));
        map.put("Мурлыка", new Cat("Мурлыка"));
        map.put("Котофей", new Cat("Котофей"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
    HashSet<Cat> set = new HashSet<>(map.values());
     return set;   
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
