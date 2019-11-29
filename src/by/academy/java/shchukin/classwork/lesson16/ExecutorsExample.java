package by.academy.java.shchukin.classwork.lesson16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("Execute task");
			}
		};

		singleThreadExecutor.submit(task);//следующий таск выполнится после завершения данного, т.к. это SingleThreadExecutor
		singleThreadExecutor.submit(task);
		singleThreadExecutor.submit(task);

		singleThreadExecutor.shutdown();//запрет на добавление новых тасков
// singleThreadExecutor.submit(task);
	}

}
