package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFa = new Human("Михаил", true, 60);
        Human grandFa2 = new Human("Михаил", true, 70);
        Human grandMa = new Human("Надя", false, 60);
        Human grandMa2 = new Human("Нина", false, 65);

        Human mather = new Human("Ирина", false, 42, grandFa, grandMa);
        Human father = new Human("Олег", true, 45, grandFa2, grandMa2);

        Human man1 = new Human("Аня", false, 12, mather, father);
        Human man2 = new Human("Катя", false, 18, mather, father);
        Human man3 = new Human("Антон", true, 23, mather, father);

        System.out.println(grandFa);
        System.out.println(grandFa2);
        System.out.println(grandMa);
        System.out.println(grandMa2);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(man3);
    }

    public static class Human {
        //напишите тут ваш код
          String name;
          boolean sex;
          int age;
          Human father;
          Human mother;
          //Конструктор
        public Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human (String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;
        }
    }
}






















