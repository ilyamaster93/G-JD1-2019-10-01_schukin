package by.academy.java.shchukin.classwork.lesson10;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleTest2 {

	public static void main(String[] args) {
Locale locale = new Locale("by", "BY");
NumberFormat rubFormat = NumberFormat.getCurrencyInstance(locale);
System.out.println(rubFormat.format(10000)); //м-ом format форматируем в строку

	}

}
