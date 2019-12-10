package by.academy.java.shchukin.homework.task5;

import java.io.File;
import java.util.Scanner;

public class Two {

	private static File folder;

	public static void main(String[] args) {
		System.out.println("Enter disk name");
		Scanner sc = new Scanner(System.in);
	//char charDiskName = sc.next().charAt(0);
		String diskName = sc.nextLine();
		File folder = new File(diskName  + ":\\");
		for (File file : folder.listFiles()) {
			System.out.println("File name:" + file.getName());
			System.out.println("File size in bytes:" + file.length());
			System.out.println("-------------------------------------");
		}
	}
}

