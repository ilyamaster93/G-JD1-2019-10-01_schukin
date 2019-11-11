package by.academy.java.shchukin.homework.task4.car;

public class Engine {
	private double volume;

	public Engine(double volume) {
		super();
		this.volume = volume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		if (volume > 0) {
			this.volume = volume;
		} else {
			System.out.println("Ошибка! Отрицательный объем!");
		}
	}

}
