package by.academy.java.shchukin.homework.task4.offtop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution3 {
static Integer a, b;

	public Solution3(Integer a, Integer b) {
this.a=a;
this.b=b;
}

	public Integer getA() {
	return a;
}

public void setA(Integer a) {
	this.a = a;
}

public Integer getB() {
	return b;
}

public void setB(Integer b) {
	this.b = b;
}

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(reader.readLine());
		b = Integer.parseInt(reader.readLine());
		Solution3 one=new Solution3 (a,b);
		one.setA(a);
        one.setB(b);
		
		if ((a >= 0) && (b >= 0)) {
			System.out.println(one.nod(a,b));
			System.out.println(one.nok(a,b));
			
		} else {
			throw new Exception();
		}
	}

	public static Integer nod(Integer a, Integer b) {
		while (b != 0) {
			Integer tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
	
	public static Integer nok(Integer a, Integer b) {
		Integer p = a * b;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
            Integer nod = a + b;
            Integer nok= p / nod;
            a = nod;
            b= nok;
        }
        return b;

    }


}
