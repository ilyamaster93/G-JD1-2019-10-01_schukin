package by.academy.java.shchukin.classwork.lesson10;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();

		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayName());

	}

}
