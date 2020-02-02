package by.javarush.NineLevel;
/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution0905 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        
        int i = 0;
        for (StackTraceElement element : stackTraceElements)
        
            i++;
        System.out.println(i);
            return i;
    }
}

