package by.javarush.TenLevel;
/* 
Конструкторы класса Human
*/

public class Solution1013 {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private int age;
        private int weight;
        private String name;
        private String momName;
        private String dadName;
        private String sex;
		
        public Human(int age, int weight) {
			super();
			this.age = age;
			this.weight = weight;
		}

		public Human(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public Human(int age, int weight, String sex) {
			super();
			this.age = age;
			this.weight = weight;
			this.sex = sex;
		}

		public Human(String name, String sex) {
			super();
			this.name = name;
			this.sex = sex;
		}

		public Human(int age, String name, String momName) {
			super();
			this.age = age;
			this.name = name;
			this.momName = momName;
		}

		public Human(int age, int weight, String name, String momName) {
			super();
			this.age = age;
			this.weight = weight;
			this.name = name;
			this.momName = momName;
		}

		public Human(int age, int weight, String name, String momName, String dadName) {
			super();
			this.age = age;
			this.weight = weight;
			this.name = name;
			this.momName = momName;
			this.dadName = dadName;
		}

		public Human(int age, int weight, String name, String momName, String dadName, String sex) {
			super();
			this.age = age;
			this.weight = weight;
			this.name = name;
			this.momName = momName;
			this.dadName = dadName;
			this.sex = sex;
		}

		public Human(String name, String momName, String dadName, String sex) {
			super();
			this.name = name;
			this.momName = momName;
			this.dadName = dadName;
			this.sex = sex;
		}

		public Human(String name) {
			super();
			this.name = name;
		}    
       
    }
}
