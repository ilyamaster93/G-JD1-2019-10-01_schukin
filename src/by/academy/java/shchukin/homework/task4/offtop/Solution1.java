package by.academy.java.shchukin.homework.task4.offtop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution1 {
    static Integer i,y;
	public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        i = Integer.parseInt(s);
        String m = reader.readLine();
        y = Integer.parseInt(m);
        if (i <= 0 || y <= 0) throw new Exception();
        System.out.println(gcd(i, y));
        
        public static int gcd(Integer a,Integer b) {
            while (b !=0) {
                int tmp = a%b;
                a = b;
                b = tmp;
            }
            return a;
        }
        
        
        
        
        
        int r;
        while (y != 0) {
            r = i % y;
            i = y;
            y = r;
        }
        System.out.println(i);
       
	
	
	
	
	
	
	
	
	}
    
    
    
        }