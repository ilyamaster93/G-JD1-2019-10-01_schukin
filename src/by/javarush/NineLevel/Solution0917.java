package by.javarush.NineLevel;

/* 
Перехват unchecked-исключений
*/

public class Solution0917 {
    public static void main(String[] args) {
        handleExceptions(new Solution0917());
    }

    public static void handleExceptions(Solution0917 obj) {
        try {
        obj.method1();
        obj.method2();
        obj.method3();
        }
        catch (RuntimeException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

