package by.academy.java.shchukin.classwork.lesson13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("t.tmp");
		ObjectInputStream ois = new ObjectInputStream(fis);
		int i = ois.readInt();
		String today = (String) ois.readObject();
		Date date = (Date) ois.readObject();
		ois.close();
	}
}
