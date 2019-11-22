package by.academy.java.shchukin.classwork.lesson14;
public class SampleCounter {

public static void main(String[] args) throws InterruptedException {
Counter counter = new Counter();
CounterThread ct = new CounterThread(counter);
ct.start();
Thread.sleep(1000);
System.out.println("Counter" + counter.getCounter());
}

static class Counter {
private long counter = 0L;

public void increaseCounter() {
counter++;

}

public long getCounter() {
return counter;
}

}

static class CounterThread extends Thread {
private Counter counter;

public CounterThread(Counter counter) {
this.counter = counter;
}

@Override
public void run() {
for (int i = 0; i < 1000; i++) {
counter.increaseCounter();

}
}

}

}