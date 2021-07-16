package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("Anton", 23, "Arma di Taggia");
        Man man1 = new Man("Oleg", 45, "Gomel");
        Woman woman = new Woman("Iryna", 42, "Taggia");
        Woman woman1 = new Woman("Marina", 29, "Brest");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);

    }
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }




    //напишите тут ваш код
}
