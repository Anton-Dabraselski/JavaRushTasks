package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        int[] numb = new int[10];

        for (int i=0; i<str.length; i++){
            str[i] = reader.readLine();
            numb[i] = str[i].length();
            System.out.println(numb[i]);
        }





    }
}
