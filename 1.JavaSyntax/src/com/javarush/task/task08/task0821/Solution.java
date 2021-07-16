package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> people = new HashMap<>();
        people.put("Smirnov", "Anton");
        people.put("Metrov", "Anton");
        people.put("Sidorov", "Jenia");
        people.put("Кошкина", "Юля");
        people.put("Кошкина", "Марина");
        people.put("Максимук", "Яна");
        people.put("Бресткая", "Оля");
        people.put("Гомельская", "Люда");
        people.put("Smirnov", "Олег");
        people.put("Noname", "Noname");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
