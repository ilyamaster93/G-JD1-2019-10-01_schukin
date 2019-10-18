package by.academy.java.shchukin.classwork.lesson5;

public class Three {

	public static void main(String[] args) {
		String str = "Test             string for split";
		//м-д split режет строку на части и возвращает массив
		String [] words = str.split(" +"); // пробел и плюсик - это регулярка, плюс означет что есть один либо более символов пробела, минимум одного
		for (String word: words) {
			System.out.print(word + " ");
		}

	}

}
