package by.academy.java.shchukin.homework.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class One {

	private static String text;
	private static String[] strArr;
	private static String[] strArrWithoutSymbols;

	public static void main(String[] args) throws IOException, ProtocolException, IOException {

		text = readFromUrl("https://drive.google.com/uc?export=download&id=1AoZPYYLLdEHxmvQCcpyrI1Ej-cJ_3IqW");
		System.out.println(text);
		strArr = text.split(" ");
		strArrWithoutSymbols = text.trim().split("[\\s.,?!]+");
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
