package by.academy.java.shchukin.classwork.generics;

public class Test {

	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.setItem("Test");
		Object item = box.getItem();
		Integer itemInt = (Integer) item;
	}

}
