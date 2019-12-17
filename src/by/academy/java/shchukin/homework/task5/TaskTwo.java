package by.academy.java.shchukin.homework.task5;

import java.io.File;
import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		System.out.println("Enter disk name");
		Scanner sc = new Scanner(System.in);
		String diskName = sc.nextLine();
		File folder = new File(diskName + ":\\");
		filesAndDirectoryesViewer(folder, 0);
	}

	private static void filesAndDirectoryesViewer(File file, int level) {
		File[] files = file.listFiles();
		StringBuilder stringForFiles = new StringBuilder();
		StringBuilder stringForDirectories = new StringBuilder();
		if (files == null) {
			return;
		}
		for (File p : files) {
			if (p.isFile()) {
				for (int i = 0; i < level + 1; i++) {
					stringForFiles.append("");
				}
				System.out.printf("File name:" + "%.15s%n", p.getName());
				System.out.println("File size in bytes:" + p.length());
				System.out.println("-------------------------------------");
			}
			if (p.isDirectory()) {
				try {
					for (int i = 0; i < level + 1; i++) {
						stringForDirectories.append("-");
					}
					System.out.printf("Direcory name:" + "%.15s%n", p.getName());
					System.out.println("-------------------------------------");
					if (level >= 5) {
						continue;
					}
					filesAndDirectoryesViewer(p, level++);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
