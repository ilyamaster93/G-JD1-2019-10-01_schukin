package by.academy.java.shchukin.classwork.lesson17;

public class TestAnonymus {

	public static void main(String[] args) {

		Runnable task1 = new Runnable() { // здесь не надо точки с запятой, это анонимный класс, заимплеменченный от
											// интерфейса Runnable, можно создать анонимный класс от любого инртерфейса
											// или класса, кроме final
			@Override
			public void run() {
				System.out.println();
			}
		};

	}

}
