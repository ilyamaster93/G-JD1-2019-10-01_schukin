package by.academy.java.shchukin.classwork.lesson9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");
		words.add("Four");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
