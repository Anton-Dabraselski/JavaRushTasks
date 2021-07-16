package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name){
        this.name = name;
        this.age = 3;
        this.weight = 5;
        this.color = "Color";
    }
    public void initialize(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "color";
    }
    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "color";
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 2;
        this.address = null;
        this.name = null;
    }
    public void initialize(int weight,String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 2;
    }



    public static void main(String[] args) {

    }
}
