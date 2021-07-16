package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        //напишите тут ваш код
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> resultD = new HashSet<Dog>();

        resultD.add(new Dog());
        resultD.add(new Dog());
        resultD.add(new Dog());
        return resultD;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        HashSet<Object> mix = new HashSet();
        mix.addAll(cats);
        mix.addAll(dogs);

        return mix;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Cat x : cats){
            pets.remove(x);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x : pets){
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat{
    }
    public static class Dog{
    }
}
