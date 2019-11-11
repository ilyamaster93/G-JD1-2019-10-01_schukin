
package by.academy.java.shchukin.homework.task4.car;

public class Wheel {
	private double diametr;
	private String tyre;
	private String tyreType;

	public Wheel(double diametr, String tyre, String tyreType) {
		this.diametr = diametr;
		this.tyre = tyre;
		this.tyreType = tyreType;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		if (diametr > 0) {
			this.diametr = diametr;
		} else {
			System.out.println("Ошибка! Отрицательный диаметр!");
		}
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

}