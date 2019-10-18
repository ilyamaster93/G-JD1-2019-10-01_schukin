package by.academy.java.shchukin.classwork.lesson5;

public class Two {

	public static void main(String[] args) {
		String str = "Test     multipel     spaces";
		//Метод создал новый объект строку, в котором символы пробела заменил Одни пробелом
		System.out.println(str.replaceAll(" +", " "));
	}
}
