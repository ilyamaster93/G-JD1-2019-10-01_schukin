package by.academy.java.shchukin.classwork.lesson13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarDeserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("car.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);

		CarOne car = (CarOne) ois.readObject();

		System.out.println(car);

	}

}
