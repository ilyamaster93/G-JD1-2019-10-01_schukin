package by.academy.java.shchukin.classwork.lesson15;

class Incremenator extends Thread {
	private volatile boolean isIncrement = true;
	private volatile boolean toBeFinished = false;
	public int mValue = 0;

	public void changeAction() {
		isIncrement = !isIncrement;
	}

	public void finish() {
		this.toBeFinished = true; // булевский флаг (созданный вручную) для окончания потока, потоком main, ЖДЕТ, ПОКА СПЯЩИЙ ПОТОК ПРОСНЕТСЯ
	}

	@Override
	public void run() {
		System.out.println("Value = ");
		do {
			// if (!toBeFinished) {
			if (!Thread.interrupted()) { // булевский флаг (ПРОГРАММНЫЙ) для окончания потока, потоком main, БУДИТ спящие потоки
				if (isIncrement) {
					mValue++;
				} else {
					mValue--;
				}
				System.out.println(mValue + " ");
			} else {
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (final InterruptedException e) {
				System.out.println("Interrupted!");
				return;
			}
		} while (true);
	}

}