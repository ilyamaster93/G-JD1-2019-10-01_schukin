package by.academy.java.shchukin.classwork.lesson6;

public class One {

	private static abstract class Shape {
		abstract void draw();
	}

	private static class Circle extends Shape {
		void draw() {
			System.out.print("O");
		}
	}

	private static class Triangle extends Shape {
		void draw() {
			System.out.print("/_\\");
		}
	}

	public static void main(String[] args) {
		drawShape5Times(new Circle());
		System.out.println();
		drawShape5Times(new Triangle());
	}

	public static void drawShape5Times(Shape shape) {
		for (int i = 0; i < 5; i++) {
			shape.draw();
		}
	}

	// наследование рулит!
	/*
	 * public static void drawTriangle5Times(Triangle triangle) { for (int i = 0; i
	 * < 5; i++) { triangle.draw(); } }
	 * 
	 * public static void drawCircles5Times(Circle circle) { for (int i = 0; i < 5;
	 * i++) { circle.draw(); } }
	 */

}
