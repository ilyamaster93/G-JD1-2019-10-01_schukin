package by.academy.java.shchukin.classwork.lesson12;

public class ByteToStringTest {

	public static void main(final String[] args) {
		final byte[] byteArray = {0x48, 0x65, 0x6c, 0x6c, 0x6f, 0x20, 0x57, 0x6f, 0x72, 0x6c, 0x64, 0x21 };
			final String strIntegers = new String(byteArray);
			System.out.println(strIntegers);
			}

}
