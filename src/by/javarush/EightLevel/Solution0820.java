package by.javarush.EightLevel;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution0820 {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //напишите тут ваш код
        for (int i=0; i<4; i++) {
            result.add (new Cat());
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> resultD = new HashSet<Dog>();

        //напишите тут ваш код
        for (int i=0; i<3; i++) {
            resultD.add (new Dog());
        }

        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        //В группу животных собираются коты и собаки
        HashSet<Object> pets = new HashSet<Object>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object tempPets : pets)
        System.out.println(tempPets);
    }

    //напишите тут ваш код
    public static class Cat {
        
    }
    public static class Dog {
        
    }
}
