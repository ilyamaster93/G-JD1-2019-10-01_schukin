package by.javarush.FiveteenLevel;
public class Solution1526 {
    
	public static void main(String[] args) {
        System.out.println("Работает main");
		new B(6);
		System.out.println("main окончил работу");
    }

    public static class A {
    	private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        protected void initialize() {
        	System.out.println("Работает блок initialize class A");
        	System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
        	System.out.println("Работает блок initialize class B");
        	System.out.println(f1);
        }
    }
}