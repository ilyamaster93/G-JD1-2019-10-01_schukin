package by.academy.java.shchukin.homework.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
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

public class One {

	private static String[] strArr;
	private static List<String> sShortWordsList;
	private static List<String> sLongWordsList;

	public static void main(String[] args) throws IOException, ProtocolException, IOException {

		String text = readFromUrl("http://25.io/toau/audio/sample.txt");
		System.out.println(text);
		strArr = text.trim().split("[\\s.,?!]+");

		// task1
		System.out.println("Enter number");
		int m = 0;
		Scanner sc = new Scanner(System.in);
		try {
			m = sc.nextInt();
		} catch (InputMismatchException fg) {
			System.out.print("Not number");
			return;
		}

		System.out.println("Enter symbol");
		Scanner sc2 = new Scanner(System.in);
		char symbol = sc2.next().charAt(0);

		for (int i = 0; i < strArr.length; i++) {

			String newStrArr[] = new String[strArr.length];
			if (strArr[i].length() > m) {
				newStrArr[i] = strArr[i].substring(0, m) + symbol + strArr[i].substring(m + 1);
			} else {
				newStrArr[i] = strArr[i];
			}
			System.out.print(newStrArr[i] + " ");
		}

		// task2
		System.out.println("\nEnter you number");
		int n = 0;
		Scanner sc3 = new Scanner(System.in);
		try {
			n = sc3.nextInt();
		} catch (InputMismatchException fg) {
			System.out.print("Not number");
			return;
		}
		System.out.println("\nThe most recurring characters");
		text.chars().mapToObj(e -> e).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.sorted((e1, e2) -> (int) (e2.getValue() - e1.getValue())).limit(n)
				.forEach(e -> System.out.println((char) (int) e.getKey() + " - " + e.getValue()));

		// task3
		String pattern = "\\b(.).*?\\1\\b";
		Pattern p = Pattern.compile(pattern);
		Matcher m1 = p.matcher(text);
		while (m1.find()) {
			System.out.println(text.substring(m1.start(), m1.end()));
		}
		// task4
		sShortWordsList = new ArrayList<String>();
		sLongWordsList = new ArrayList<String>();
		wordMaxMinWriter();

	}

	public static void wordMaxMinWriter() {
		int minimalWordLength = strArr[0].length();
		int maximalWordLength = strArr[0].length();

		for (String currentWord : strArr) {
			if (minimalWordLength > currentWord.length()) {
				minimalWordLength = currentWord.length();
				sShortWordsList.clear();
				sShortWordsList.add(currentWord);
			} else if (minimalWordLength == currentWord.length()) {
				sShortWordsList.add(currentWord);
			}
		}
		System.out.println("Shortest words:\n " + Arrays.toString(sShortWordsList.toArray()));

		for (String currentWord : strArr) {
			if (maximalWordLength < currentWord.length()) {
				maximalWordLength = currentWord.length();
				sLongWordsList.clear();
				sLongWordsList.add(currentWord);
			} else if (maximalWordLength == currentWord.length()) {
				sLongWordsList.add(currentWord);
			}
		}
		System.out.println("Longest words:\n " + Arrays.toString(sLongWordsList.toArray()));
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
