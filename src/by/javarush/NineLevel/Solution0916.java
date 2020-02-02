package by.javarush.NineLevel;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution0916 {
    public static void main(String[] args) {
        
        handleExceptions(new Solution0916());
    }

    public static void handleExceptions(Solution0916 obj) {
        try {
        obj.method1();
        obj.method2();
        obj.method3();
        }
        catch (IOException e) {
            System.out.println(e.getMessage() + ", " + e.getClass().getSimpleName());
        }
        catch (NoSuchFieldException e) {
            System.out.println(e.getMessage() + ", " + e.getClass().getSimpleName());
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
