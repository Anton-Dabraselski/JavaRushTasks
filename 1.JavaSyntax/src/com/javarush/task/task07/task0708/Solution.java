package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        strings = new ArrayList<>();
        int max = 0;

        for (int i = 0; i<5; i++){
            String s = reader.readLine();
            strings.add(i, s);
            if (strings.get(i).length() > max){
                max = strings.get(i).length();
            }
        }

        for (String x: strings){
            if (x.length()==max){
                System.out.println(x);
            }
        }




    }
}
