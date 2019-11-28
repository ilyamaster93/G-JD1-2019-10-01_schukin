package by.academy.java.shchukin.homework.task3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    private static String[] sSentencesWords;
    private static List <String> sShortWordsList;
    private static List <String> sLongWordsList;
 
    public static void main(String[] args) throws IOException {
    	System.out.println("Enter text");
    	sShortWordsList = new ArrayList <String> ();
        sLongWordsList = new ArrayList <String> ();
        sSentencesWords = (new Scanner(System.in)).nextLine().trim().split("[\\s.,?!]+");
 
        int minimalWordLength = sSentencesWords[0].length();
        for (String currentWord : sSentencesWords) {
            if (minimalWordLength > currentWord.length()) {
                minimalWordLength = currentWord.length();
                sShortWordsList.clear();
                sShortWordsList.add(currentWord);
            } else if (minimalWordLength == currentWord.length()) {
                sShortWordsList.add(currentWord);
            }
        }
        System.out.println("Shortest words:\n " + Arrays.toString(sShortWordsList.toArray()));
        
        int maximalWordLength = sSentencesWords[0].length();
        for (String currentWord : sSentencesWords) {
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
}
