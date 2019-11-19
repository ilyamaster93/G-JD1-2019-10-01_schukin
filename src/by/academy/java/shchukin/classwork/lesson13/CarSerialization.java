package by.academy.java.shchukin.classwork.lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class CarSerialization {

	public static void main(String[] args) throws IOException {
		CarOne car = new CarOne("12345");
		FileOutputStream fos = new FileOutputStream("car.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(car);
		oos.close();

	}
}
