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

public class TaskOne {

	private static String[] strArrWithoutSymbols;

	public static void main(String[] args) throws IOException, ProtocolException, IOException {

		String text = readFromUrl("https://drive.google.com/uc?export=download&id=1AoZPYYLLdEHxmvQCcpyrI1Ej-cJ_3IqW");
		System.out.println(text);
		strArrWithoutSymbols = text.trim().split("[\\s.,?!&()0-9+]+");

		for (int i = 0; i < strArrWithoutSymbols.length; i++) {
			System.out.print(strArrWithoutSymbols[i]);
		}

		System.out.println();
		diretoriesAndFIlesCreator();
	}

	public static void diretoriesAndFIlesCreator() {
		File homeDirectory = new File("E:\\shchukin\\forFiveTask");
		String newStrArr[] = new String[strArrWithoutSymbols.length];
		for (int i = 0; i < strArrWithoutSymbols.length; i++) {
			String directoryName = strArrWithoutSymbols[i].substring(0, 1);
			File newDirectory = new File(homeDirectory, directoryName);
			/*
			 * if (!newDirectory.exists()) { if (newDirectory.mkdirs()) {
			 * System.out.println("Directory is created!"); } else {
			 * System.out.println("Failed to create directory!"); } } else {
			 * System.out.println("Directory already exist!"); }
			 */
			if (newDirectory.exists()) {
				System.out.println("Directory already exist!");
			} else if (newDirectory.mkdirs()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}

			File newFile = new File(newDirectory, "words.txt");
			if (!newFile.exists()) {
				try {

					if (newFile.createNewFile()) {
						System.out.println("File is created!");
						FileOutputStream fileOutputStream = new FileOutputStream(newFile);
						for (int i1 = 0; i1 < strArrWithoutSymbols.length; i1++) {
							if (directoryName.equalsIgnoreCase(strArrWithoutSymbols[i].substring(0, 1))) {
								String content = strArrWithoutSymbols[i];
								fileOutputStream.write(content.getBytes());
								fileOutputStream.close();
							}
						}
					} else {
						System.out.println("Failed to create file!");
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("File already exist!");
			}

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
