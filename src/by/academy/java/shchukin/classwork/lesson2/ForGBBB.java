package by.academy.java.shchukin.classwork.lesson2;

import java.util.ArrayList;
import java.util.List;

import by.academy.java.shchukin.classwork.lesson1.Man;

public class ForGBBB {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println("free mem: " + Runtime.getRuntime().freeMemory());

		for (int i = 0; i < 15_000_000; i++) {
			list.add(new Man(i));
		}
		System.out.println("free mem: " + Runtime.getRuntime().freeMemory());
	}
}