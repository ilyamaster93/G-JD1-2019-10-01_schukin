package by.academy.java.shchukin.classwork.lesson14;
public class ThreadsImplementsRunnable {

public static class HelloRunnable implements Runnable {
@Override
public void run() {
System.out.println("Hello from a thread!");
}
}

public static void main(String[] args) {
HelloRunnable helloRunnable = new HelloRunnable();
Thread thread = new Thread(helloRunnable);
System.out.println("Перед стартом нового потока");
thread.start();
System.out.println("После старта нового потока");

}

}