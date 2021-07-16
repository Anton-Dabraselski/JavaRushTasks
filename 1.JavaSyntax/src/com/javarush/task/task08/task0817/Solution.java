package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Сидоров", "Антон");
        map.put("Сидоровв", "Антон");
        map.put("Смирнов", "Дима");
        map.put("Сергеев", "Дмитрий");
        map.put("Михалков", "Сергей");
        map.put("Путин", "Антонио");
        map.put("Медведев", "Михаил");
        map.put("Сидельников", "Антон");
        map.put("Петохов", "Дима");
        map.put("Трерской", "Валера");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        List<String> list = new LinkedList<>(map.values());

        for (String s : list) {
            if (Collections.frequency(map.values(), s) > 1) {
                removeItemFromMapByValue(map, s);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
