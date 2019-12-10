package by.academy.java.shchukin.homework.task5;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;

public class One {

	private static String text;
	// private static String[] strArr;
	private static String[] strArrWithoutSymbols;

	public static void main(String[] args) throws IOException, ProtocolException, IOException {

		text = readFromUrl("https://drive.google.com/uc?export=download&id=1AoZPYYLLdEHxmvQCcpyrI1Ej-cJ_3IqW");
		System.out.println(text);
		// strArr = text.split(" ");
		strArrWithoutSymbols = text.trim().split("[\\s.,?!&()0-9+]+");
		/*
		 * for (int i = 0; i < strArr.length; i++) { System.out.print(strArr[i]); }
		 * System.out.println();
		 */
		for (int i = 0; i < strArrWithoutSymbols.length; i++) {
			System.out.print(strArrWithoutSymbols[i]);
		}

		System.out.println();
		diretoriesCreator();

		System.out.println();
		filesCreator();

		// System.out.println();
		// filesWriter();

	}

	public static void diretoriesCreator() {
		File homeDirectory = new File("E:\\shchukin\\forFiveTask");
		String newStrArr[] = new String[strArrWithoutSymbols.length];
		for (int i = 0; i < strArrWithoutSymbols.length; i++) {
			String directoryName = strArrWithoutSymbols[i].substring(0, 1);
			File newDirectory = new File(homeDirectory, directoryName);
			if (!newDirectory.exists()) {
				if (newDirectory.mkdirs()) {
					System.out.println("Directories are created!");
				} else {
					System.out.println("Failed to create directories!");
				}
			} else {
				System.out.println("Directories already exist!");
			}
			File newFile = new File(newDirectory, "words.txt");
		}
	}

	public static void filesCreator() throws IOException {
		File file1 = new File("E:\\shchukin\\forFiveTask\\words.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file1);
		String content = "Тут должен быть какой-то текст";
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();

		File homeDirectory = new File("E:\\shchukin\\forFiveTask");
		for (File file : homeDirectory.listFiles()) {
			System.out.println(file.getName());
			// file.createNewFile();
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
