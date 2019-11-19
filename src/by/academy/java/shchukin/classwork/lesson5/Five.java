package by.academy.java.shchukin.classwork.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Five {

	public static void main(String[] args) {
//созд регул выражение и Объект Pattern
		Pattern p = Pattern.compile(" +- +");
//созд объект класса Matcher
		Matcher matcher = p.matcher("Test - string - test");
		// поиск вып-ся м-ом find на соотв-ие регул выражению в строке и вернет true
		// если оно найдено, false - если нет
		while (matcher.find()) {
			// местопол-ие найденных совпадений ищем с помощью методов start и end
			System.out.println(matcher.start() + " " + matcher.end());
		}

	}

}
