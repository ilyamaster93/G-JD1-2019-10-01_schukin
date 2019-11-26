package by.academy.java.shchukin.homework.task3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Gibrid {

	public static void main(String[] args) throws IOException, ProtocolException, IOException {

		String text = readFromUrl("http://25.io/toau/audio/sample.txt");
		System.out.println(text);
		String[] strArr = text.split(" ");

		System.out.println("Enter number");
		int m = 0;
		Scanner sc2 = new Scanner(System.in);
		try {
			m = sc2.nextInt();
		} catch (InputMismatchException fg) {
			System.out.print("Not number");
			return;
		}

		System.out.println("Enter symbol");
		Scanner sc3 = new Scanner(System.in);
		char symbol = sc3.next().charAt(0);

		for (int i = 0; i < strArr.length; i++) {

			String newStrArr[] = new String[strArr.length];
			if (strArr[i].length() > m) {
				newStrArr[i] = strArr[i].substring(0, m) + symbol + strArr[i].substring(m + 1);
			} else {
				newStrArr[i] = strArr[i];
			}
			System.out.print(newStrArr[i] + " ");
		}

		System.out.println("Enter you number");
		int n = 0;
		Scanner sc4 = new Scanner(System.in);
		try {
			n = sc4.nextInt();
		} catch (InputMismatchException fg) {
			System.out.print("Not number");
			return;
		}
				
		text.chars().mapToObj(e -> e).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.sorted((e1, e2) -> (int) (e2.getValue() - e1.getValue())).limit(n)
				.forEach(e -> System.out.println((char) (int) e.getKey() + " - " + e.getValue()));

		String pattern = "((.)\\w*\\2 ?)+\\Z";
	    Pattern p = Pattern.compile(pattern);
	    Matcher m1 = p.matcher(text);
	    while (m1.find()) {
	        System.out.println(text);
	    }
		
	}

	private static String readFromUrl(final String url) throws MalformedURLException, IOException, ProtocolException {
		final URL obj = new URL(url);
		final HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

		connection.setRequestMethod("GET");
		String string = null;
		try (final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));) {
			String inputLine;
			final StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
				string = response.toString();
			}
		}
		return string;
	}

}
