package by.academy.java.shchukin.classwork.lesson4;

public class Two {

	private static int staticField;
	private int nonStaticField;

	public static void main(String[] args) {
		doStatic();
		// doNonStatic();
		System.out.println(staticField);
//System.out.println(nonStaticField);
//Ниже нужно верно указать вызываемый массив
//Two.main(new String array []);
		Two objectInstance = new Two();
		System.out.println(objectInstance.nonStaticField);
		System.out.println(objectInstance.staticField);
		objectInstance.doStatic();
		objectInstance.doNonStatic();
	}

	private static void doStatic() {
	}

	private static void doNonStatic() {
	}
}