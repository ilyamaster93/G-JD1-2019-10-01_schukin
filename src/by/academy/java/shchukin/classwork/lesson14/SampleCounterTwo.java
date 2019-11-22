package by.academy.java.shchukin.classwork.lesson14;

import java.util.concurrent.atomic.AtomicInteger;

import by.academy.java.shchukin.classwork.lesson14.SampleCounter.Counter;
import by.academy.java.shchukin.classwork.lesson14.SampleCounter.CounterThread;

public class SampleCounterTwo {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
		for (int i = 0; i < 200; i++) {
			CounterThread ct = new CounterThread(counter);
			ct.start();
		}
		Thread.sleep(1000);
		System.out.println("Counter" + counter.getCounter()); // Why not 200000? Because it use CPU cache and because
																// CPU (по своей архитектруре) works with takts,
																// операция инкремента занимает больше одного такта, и
																// совсем не факт что процессор каждый раз отдаст
																// несколько подряд минимально необходимых тактов для
																// соврешения операции каждому потоку, отсюда
																// погрешность. Написали слово "synchronized" -
																// поставили потоки в очередь, и решили задачу, но смысл
																// многопоточности потерялся. Поэтому заюзали
																// AtomicInteger, который гарантирует атомарность
																// операции
	}

	static class Counter {
		private AtomicInteger counter = new AtomicInteger(0);

		public void increaseCounter() {
			counter.incrementAndGet();

		}

		public AtomicInteger getCounter() {
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