package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("BigBoss", new Date("April 2 1990"));
        map.put("BigBus", new Date("December 11 1994"));
        map.put("Sibert", new Date("December 12 1995"));
        map.put("Trumping", new Date("November 2 1995"));
        map.put("Putin", new Date("August 20 1995"));
        map.put("Medvedev", new Date("October 6 1995"));
        map.put("Smirnov", new Date("July 6 2000"));
        map.put("Glush", new Date("March  20 1995"));
        map.put("KimChin", new Date("September 18 1976"));
       // map.put("KimChin", new Date(1990, 6, 19));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<String, Date> entry = iter.next();
            if (entry.getValue().getMonth()>4 && entry.getValue().getMonth() <8){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
