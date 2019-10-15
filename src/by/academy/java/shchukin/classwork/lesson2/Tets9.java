package by.academy.java.shchukin.classwork.lesson2;

public class Tets9 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "password";

		boolean isAuthenticated = verifyCredentials(username, password);

		if (isAuthenticated) {
			System.out.println("access allowed");
		} else {
			System.out.println("access denied");
		}
	}

	private static boolean verifyCredentials(String username, String password) {
		if (someMagic()) {
			return "admin".equals(username) && "password".equals(password);
		} else {
			return false;
		}
	}

	private static boolean someMagic() {
		long currentTimeMillis = System.currentTimeMillis();
		String string = "" + currentTimeMillis;
		return !string.endsWith("0");
	}
}
