package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ch1 = new Human("Child1", true, 15, null);
        Human ch2 = new Human("Child2", false, 10, null);
        Human ch3 = new Human("Child3", true, 13, null);
        ArrayList<Human> childs = new ArrayList<>();
        childs.add(ch1);
        childs.add(ch2);
        childs.add(ch3);

        Human father = new Human("Отец", true, 30, childs);
        ArrayList<Human> parF = new ArrayList<>();
        parF.add(father);

        Human mather = new Human("Мать", false, 28, childs);
        ArrayList<Human> parM = new ArrayList<>();
        parM.add(mather);

        Human grandFatherF = new Human("Дед Отца", true, 65, parF);
        Human grandFatherM = new Human("Дед Матери", true, 70, parM);
        Human grandMatherF = new Human("Бабушка Отца", false, 70, parF);
        Human grandMatherM = new Human("Бабушка Матери", false, 70, parM);

        System.out.println(grandFatherF);
        System.out.println(grandFatherM);
        System.out.println(grandMatherF);
        System.out.println(grandMatherM);
        System.out.println(father);
        System.out.println(mather);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human (String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex  = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            //-------добавил и сюда код (поправку)------
            if (this.children == null){
                return text;
            }
            //-------------------------------
            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
