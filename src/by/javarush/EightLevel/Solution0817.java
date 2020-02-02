package by.javarush.EightLevel;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution0817 {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Петров", "Дима");
        map.put("Иванов", "Женя");
        map.put("Михайлов", "Алекс");
        map.put("Трасько", "Оля");
        map.put("Милошевич", "Олеся");
        map.put("Радионович", "Марго");
        map.put("Поркурат", "Анастэйша");
        map.put("Черницкович", "Макс");
        map.put("Обломов", "Дима");
        map.put("Грэй", "Декстер");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        for (Map.Entry<String, String> pair : map.entrySet()) {
        String name = pair.getValue();
        removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
    	

    }
}