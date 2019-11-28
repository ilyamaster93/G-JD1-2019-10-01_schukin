package by.academy.java.shchukin.homework.task3;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Practice3 {
	public static void main(String[] args) throws Exception {
		String text = readFromUrl("http://25.io/toau/audio/sample.txt");
		System.out.println(text);
		text = correctInputText(text);
		findFirstAndLastSimilarLettersInWord(text);
		System.out.print(findFirstAndLastSimilarLettersInWord(text));
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

	public static String correctInputText(String text) {
		text = text.replace(".", "");
		text = text.replace(",", "");
		text = text.replace(";", "");
		text = text.replace(":", "");
		text = text.replace("!", "");
		text = text.replace("?", "");
		text = text.replace(".", "");
		text = text.replace("'", "");
		text = text.replace("\"", "");
		return text;
	}

	private static StringBuilder findFirstAndLastSimilarLettersInWord(String text) {
		String[] array = text.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : array) {
			if (word.charAt(0) == word.charAt(word.length() - 1)) {
				System.out.print(sb.append(word).append(" "));
			}
		}
		return sb;
	}

}
