package by.academy.java.shchukin.homework.task5;
import java.io.File;

import java.io.IOException;

public class CreateDirectory {

	public static void main(String[] args) throws IOException {
    	    	//To create single directory/folder
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
        
        //To create multiple directories/folders
        File files = new File("D:\\Directory2\\Sub2\\Sub-Sub2");
        if (!files.exists()) {
            if (files.mkdirs()) {
                System.out.println("Multiple directories are created!");
            } else {
                System.out.println("Failed to create multiple directories!");
            }
        } else {
        	System.out.println("Directories already exist!");
        }
    
	}
}