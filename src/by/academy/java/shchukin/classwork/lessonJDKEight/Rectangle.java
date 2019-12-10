package by.academy.java.shchukin.classwork.lessonJDKEight;

public interface Rectangle {
	static int squareStatic(int a, int b) { //В java8 В интерфейсе появились методы с телами
		return a*b;
	}
default int squareDefault (int a, int b) {
	return a*b;
}
}
