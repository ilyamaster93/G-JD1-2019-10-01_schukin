package by.javarush.NineLevel;
/* 
Кто меня вызывал?
*/

public class Solution0903 {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return (stackTraceElements[2].getLineNumber());
    }

    public static int method2() {
        method3();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return (stackTraceElements[2].getLineNumber());
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return (stackTraceElements[2].getLineNumber());
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return (stackTraceElements[2].getLineNumber());
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return (stackTraceElements[2].getLineNumber());
    }
}