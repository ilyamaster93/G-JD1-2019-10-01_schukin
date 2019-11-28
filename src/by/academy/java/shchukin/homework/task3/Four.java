package by.academy.java.shchukin.homework.task3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Four {

	public static void main(String[] args) throws IOException {
		//String text = "Valley wow cool lol";
		//Pattern pattern = Pattern.compile("((.)\\\\w*\\\\2 ?)+\\\\Z");
		//Matcher matcher = pattern.matcher(text);
		//while (matcher.find()) {
			//System.out.println(text.substring(matcher.start(), matcher.end()));
		//}
		String text = "Valley wow cool lol loop dawdad  dadad Wow wdawdW";
		String pattern = "\b(.).*?\1\b";
		Pattern p = Pattern.compile(pattern);
		Matcher m1 = p.matcher(text);
		while (m1.find()) {
			System.out.println(text);
			System.out.println(text.substring(m1.start(), m1.end()));
		}
	}
}
