package by.academy.java.shchukin.classwork.lesson10;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocaleTest3 {

	public static void main(final String[] args) throws ParseException {
		Locale locale = new Locale("en", "EN");
		NumberFormat numFormat = NumberFormat.getNumberInstance(locale);
		Number num = numFormat.parse("10,5");
		System.out.println(num.doubleValue()); // м-ом format форматируем в строку
	}
}
