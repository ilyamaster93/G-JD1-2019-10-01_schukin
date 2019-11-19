package by.academy.java.shchukin.classwork.lesson12;

import java.io.File;

public class FileSamples {

	public static void main(final String[] args) {
		showSamples(new File("C:\\Windows\\winhpl32.exe"));
		System.out.println("----------------------");
		showSamples(new File("C:\\Windows"));
	}

	protected static void showSamples(final File f) {
		System.out.println("File name:" + f.getName());
		System.out.println("Path:" + f.getPath());
		System.out.println("Absolute path:" + f.getAbsolutePath());
		System.out.println("Exists:" + f.exists());
		if (f.exists()) {
			System.out.println("Is writeable:" + f.canWrite());
			System.out.println("Is readable:" + f.canRead());
			System.out.println("Is a directory:" + f.isDirectory());
			System.out.println("File size in bytes:" + f.length());
		}
	}
}
