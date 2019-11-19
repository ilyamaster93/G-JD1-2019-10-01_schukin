package by.academy.java.shchukin.classwork.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tets2 {

	public static void main(String[] args) throws IOException {

		System.out.println("input username: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName = reader.readLine();

		System.out.println("Hello " + userName);

	}

}
