package by.javarush.SixSevenLevel;

import java.util.ArrayList;

/* 
Семейная перепись
*/

public class Solution0724 {
    public static void main(String[] args) {
        // напишите тут ваш код
    	Human granny1 = new Human("Алла",false,65);
		Human granny2 = new Human("Анна",false,63);
		Human ded1 = new Human("Петр",true,62);
		Human ded2 = new Human("Дима",true,61);
		Human son1 = new Human("Ilya",true,22, ded1, granny1);
		Human son2 = new Human("Mihuil",true,21, ded1, granny1);
		Human son3 = new Human("Pavel",true,24, ded1, granny1);
		Human son4 = new Human("Oleg",true,20, ded1, granny1);
		Human daughter1 = new Human("Pavel",false,29, ded2, granny2);
		ArrayList<Human> humans = new ArrayList<Human>();
		//humans.add(new Human("Петр",true,62));
		humans.add(ded1);
		humans.add(new Human("Анна",false,63));
		humans.add(new Human("Алла",false,65));
		humans.add(new Human("Дима",true,61));
		humans.add(new Human("Ilya",true,22, ded1, granny1));
		humans.add(new Human("Mihuil",true,21, ded1, granny1));
		humans.add(new Human("Pavel",true,24, ded1, granny1));
		humans.add(new Human("Oleg",true,20, ded1, granny1));
		humans.add(new Human("Pavel",false,29, ded2, granny2));
		//"granny2","ded1","ded2","son1","son2","son3","son4","daughter1"
		for (Human human: humans) {
			System.out.println(human);
		}
    }

    public static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        
        public Human(String name, boolean sex, int age) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
		}

		public Human(String name, boolean sex, int age, Human father, Human mother) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.father = father;
			this.mother = mother;
		}
								
		@Override
		public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return  "\n" + text;
        }
    }
}