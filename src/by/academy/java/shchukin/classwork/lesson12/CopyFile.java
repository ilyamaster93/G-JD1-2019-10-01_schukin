package by.academy.java.shchukin.classwork.lesson12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// FileInputStream in = null;
		// FileOutputStream out = null;

		try (FileInputStream in = new FileInputStream("input.txt");  //создаем стримы
				FileOutputStream out = new FileOutputStream("output.txt")) {
			// in = new FileInputStream("input.txt");
			// out = new FileOutputStream("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);

			}
		}
	}

}