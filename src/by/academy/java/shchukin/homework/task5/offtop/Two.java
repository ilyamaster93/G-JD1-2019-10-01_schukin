package by.academy.java.shchukin.homework.task5.offtop;

import java.io.File;
import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		System.out.println("Enter disk name");
		Scanner sc = new Scanner(System.in);
		//char charDiskName = sc.next().charAt(0);
		String diskName = sc.nextLine();
		File folder = new File(diskName + ":\\");
		for (File file : folder.listFiles()) {
			if (file.isDirectory()) {
				System.out.printf("Direcory name:" + "%.15s%n", file.getName());
				System.out.println("-------------------------------------");
			} else if (file.isFile()) {
				System.out.printf("File name:" + "%.15s%n", file.getName());
				System.out.println("File size in bytes:" + file.length());
				System.out.println("-------------------------------------");
			}

		}
	}
}
