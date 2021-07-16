package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for (int i=0; i<5; i++){
            list.add(reader.readLine());
        }

        for (String x:list){
            if (x.length()<min){
                min= x.length();
            }
        }
        for (String x : list){
            if (x.length()==min){
                System.out.println(x);
            }
        }
    }
}
