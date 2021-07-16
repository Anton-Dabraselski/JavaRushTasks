package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> catHashMap = new HashMap<>();

        catHashMap.put("Вася", new Cat("Кот"));
        catHashMap.put("Петя", new Cat("Кот"));
        catHashMap.put("Бус", new Cat("Кот"));
        catHashMap.put("Транс", new Cat("Кот"));
        catHashMap.put("Кот", new Cat("Кот"));
        catHashMap.put("Кот2", new Cat("Кот"));
        catHashMap.put("Сашка", new Cat("Кот"));
        catHashMap.put("Калян", new Cat("Кот"));
        catHashMap.put("Антон", new Cat("Кот"));
        catHashMap.put("Мурка", new Cat("Кот"));

        return catHashMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> set = new HashSet<>(map.values());
        return set;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat.name + " " + cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
