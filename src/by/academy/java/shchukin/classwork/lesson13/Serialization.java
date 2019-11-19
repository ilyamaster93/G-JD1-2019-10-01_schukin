package by.academy.java.shchukin.classwork.lesson13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Serialization {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("t.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeInt(12345);
		oos.writeObject("Today");
		oos.writeObject(new Date());
		oos.close();

	}
}
