package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Сидоров", 100);
        map.put("Сидоровв", 100);
        map.put("Смирнов", 150);
        map.put("Сергеев", 500);
        map.put("Михалков", 550);
        map.put("Путин", 200);
        map.put("Медведев", 300);
        map.put("Сидельников", 350);
        map.put("Петохов", 100);
        map.put("Трерской", 50);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);

            for (Map.Entry<String, Integer> x : copy.entrySet()) {
                if (x.getValue() < 500) {
                    map.remove(x.getKey());
                }
            }

    }

    public static void main(String[] args) {

    }
}