package by.javarush.SixSevenLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution0713 {
	static int m;
	static int n;
	static int k;

	public static void main(String[] args) throws Exception {
		// напишите тут ваш код
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> dividerThree = new ArrayList<Integer>();
		ArrayList<Integer> dividerTwo = new ArrayList<Integer>();
		ArrayList<Integer> dividerOther = new ArrayList<Integer>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 20; i++) {
			first.add(Integer.parseInt(reader.readLine()));
		}
		for (int i = 0; i < first.size(); i++) {

			if (first.get(i) % 3 == 0 && first.get(i) % 2 == 0) {
				dividerThree.add(m, first.get(i));
				m++;
				dividerTwo.add(n, first.get(i));
				n++;
			} else if (first.get(i) % 3 == 0) {
				dividerThree.add(m, first.get(i));
				m++;
			} else if (first.get(i) % 2 == 0) {
				dividerTwo.add(n, first.get(i));
				n++;
			} else {
				dividerOther.add(k, first.get(i));
				k++;
			}
		}
		printList(dividerThree);
		printList(dividerTwo);
		printList(dividerOther);
	}

	public static void printList(ArrayList<Integer> list) {
		// напишите тут ваш код
		for (Integer string : list) {
			System.out.println(string);
		}
	}
}