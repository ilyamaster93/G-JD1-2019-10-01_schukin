package by.academy.java.shchukin.homework.task5.offtop;

import java.io.File;
import java.io.IOException;

public class RevCreateDirectory {
//static String directoryName;
	public static void main(String[] args) throws IOException {
		// To create single directory/folder
		File file = new File("D:\\Directory1");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		} else {
			System.out.println("Directories already exist!");
		}

		// To create multiple directories/folders
		String directoryName = "Vasya";
		File homeDirectory = new File("E:\\shchukin\\forFiveTask");
		File newDirectory = new File(homeDirectory, directoryName);
		if (!newDirectory.exists()) {
			if (newDirectory.mkdirs()) {
				System.out.println("Multiple directories are created!");
			} else {
				System.out.println("Failed to create multiple directories!");
			}
		} else {
			System.out.println("Directories already exist!");
		}

	}
}