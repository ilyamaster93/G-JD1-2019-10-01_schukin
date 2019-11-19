package by.academy.java.shchukin.classwork.lesson10;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class LocaleTest4 {

	public static void main(final String[] args) throws ParseException {
		Locale locale = new Locale("ru", "RU");
		Date currentDate = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String format = df.format(currentDate);
		System.out.println(format);
	}
}
