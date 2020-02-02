package by.javarush.NineLevel;
/* 
Логирование стек-трейса
*/

public class Solution0906 {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
            //for (StackTraceElement element: stackTraceElements){
                //System.out.println(element.getClassName()+ ": "+element.getMethodName()+ ": " +s);
            System.out.println(stackTraceElements[2].getClassName()+ ": "+stackTraceElements[2].getMethodName()+ ": " +s);
            //}
    }
}
