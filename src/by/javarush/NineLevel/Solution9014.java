package by.javarush.NineLevel;
/* 
Группа перехвата исключений
*/

public class Solution9014 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
try{
        method1();
}
catch (Exception e) {
    
}

        //напишите тут ваш код

    }

    public static void method1() throws Exception1, Exception2, Exception3 {
        int i = (int) (Math.random() * 3);
        if (i == 0) {
            throw new Exception1();
        } else if (i == 1) {
            throw new Exception2();
        } else if (i == 2) {
            throw new Exception3();
        }
    }
}

class Exception1 extends Exception {
}

class Exception2 extends Exception1 {
}

class Exception3 extends Exception2 {
}
