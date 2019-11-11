package by.academy.java.shchukin.homework.task4.offtop;

import java.util.ArrayList;

public class Snippet {
	
	public static void main(String[] args) {
	
	   ArrayList<String> cats = new ArrayList<>();
	
	   String thomas = new String("Томас");
	   String behemoth = new String("Бегемот");
	   String philipp = new String("Филипп Маркович");
	   String pushok = new String("Пушок");
	
	   cats.add(thomas);
	   cats.add(behemoth);
	   cats.add(philipp);
	   cats.add(pushok);

	   System.out.println(cats.toString());
	}
}

