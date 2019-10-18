package by.academy.java.shchukin.classwork.lesson5;

public class Four {

	public static void main(String[] args) {
		String lang = "java";
		String user = "Dmitry";
		//variant 1
		String result = String.format("%s is learning %s", user, lang);
		System.out.println(result); 
		
		//variant 2, но печатает не с новой строки
		System.out.printf("%s is learning %s", user, lang); 
		
		//variant 2, с новой строки
				System.out.printf("%s is learning %s\n", user, lang); 
	}

}
