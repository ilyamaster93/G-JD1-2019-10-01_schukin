package by.javarush.FourteenLevel.task1420;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
/* 
НОД
*/

public class GFG {
    public static void main(String[] args) throws IOException
    {
        BigInteger result;
        
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int input1 = Integer.parseInt(reader.readLine());
            if (input1 <= 0) throw new NumberFormatException();
            int input2 = Integer.parseInt(reader.readLine());
            if (input2 <= 0) throw new NumberFormatException();

            reader.close();

            BigInteger a = new BigInteger(String.valueOf(input1));
            BigInteger b = new BigInteger(String.valueOf(input2));
            result = a.gcd(b);

            System.out.println("The GCD of "

                    + a + " and "

                    + b + " is "

                    + result);
        
    
    }

}