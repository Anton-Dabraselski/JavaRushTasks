package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Сергеев", "Антон");
        map.put("Антонов", "Антон");
        map.put("Антонова", "Алина");
        map.put("Антоноваk", "Саша");
        map.put("Corio", "Алина");
        map.put("Corios", "Марина");
        map.put("Сергеенко", "Оля");
        map.put("Seriaq", "Катя");
        map.put("Sirius", "Кристи");
        map.put("Seria", "кристи");

        return map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String x: map.values()){
            if (x.equals(name)){
                count++;
            }
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String x: map.keySet()){
            if (x.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
