package by.academy.java.shchukin.homework.task4.car;

public class Engine {
	private double volume;
	private EngineType engineType;

	private Engine(double volume, EngineType engineType) {
		super();
		this.volume = volume;
		this.engineType = engineType;
	}

	private EngineType getEngineType() {
		return engineType;
	}

	private void setEngineType(EngineType engineType) {
		this.engineType = engineType;
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
