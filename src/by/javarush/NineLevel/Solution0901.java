package by.javarush.NineLevel;
/* 
Возвращаем StackTrace
*/

public class Solution0901 {
	public static void main(String[] args) {
		method1();
	}

	public static StackTraceElement[] method1() {
		method2();
		// напишите тут ваш код
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.println(
					stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": ");
			//System.out.println(stackTraceElements.length);
		}
		return Thread.currentThread().getStackTrace();
	}

	public static StackTraceElement[] method2() {
		method3();
		// напишите тут ваш код
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.println(
					stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": ");
			//System.out.println(stackTraceElements.length);
		}
		return Thread.currentThread().getStackTrace();
	}

	public static StackTraceElement[] method3() {
		method4();
		// напишите тут ваш код
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.println(
					stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": ");
			//System.out.println(stackTraceElements.length);
		}
		return Thread.currentThread().getStackTrace();
	}

	public static StackTraceElement[] method4() {
		method5();
		// напишите тут ваш код
		{
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			System.out.println(
					stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": ");
			//System.out.println(stackTraceElements.length);
		}
		return Thread.currentThread().getStackTrace();
	}

	public static StackTraceElement[] method5() {
		// напишите тут ваш код

		{
			// напишите тут ваш код
			StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
			for (StackTraceElement element : stackTraceElements) {
				System.out.println(element.getMethodName());
				System.out.println(element.toString());
			}
			System.out.println(stackTraceElements[2].getClassName()+ ": "+stackTraceElements[2].getMethodName()+ ": ");
			System.out.println(stackTraceElements.length);
			return stackTraceElements;
		}
	}
}