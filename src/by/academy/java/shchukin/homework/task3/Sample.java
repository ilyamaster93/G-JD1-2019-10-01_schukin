package by.academy.java.shchukin.homework.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample {
	String[] strArr;
public static void main(String[] args) throws Exception {

String text = readFromUrl("http://25.io/toau/audio/sample.txt");
System.out.println(text);
String[] strArr= text.split(" ");
System.out.println("Enter symbol");
Scanner sc = new Scanner(System.in);
char symbol = sc.next().charAt(0);
System.out.println("Enter number");
int n = 0;
Scanner sc2 = new Scanner(System.in);
try{
 n = sc2.nextInt();}
catch (InputMismatchException fg)
{
System.out.print("Not number" );
return;

for(int i = 0; i<strArr.length; i++) {


    String newStrArr [] = new String[strArr.length];
    if(strArr[i].length()>n)
    {
       newStrArr[i] = strArr[i].substring(0,n) + symbol + strArr[i].substring(n+1);
    }
    else{
     newStrArr[i] = strArr[i];
    }
    System.out.print(newStrArr[i] + " ");
    
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