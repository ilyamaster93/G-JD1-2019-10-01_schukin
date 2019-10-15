package by.academy.java.shchukin.classwork.lesson1;

public class ObjectExample {
private static class Car {
	int year;
}
public static void main(final String[] args) {
	final Car c1 = new Car();
	c1.year=2010;
	final Car c2 = c1;
	
	System.out.println("�1.year=" + c1.year);
	System.out.println("�2.year=" + c2.year);
	
	System.out.println("�hange c1...");
	c1.year = 2018;
	
	System.out.println("�1.year=" + c1.year);
	System.out.println("�2.year=" + c2.year);
}
}
