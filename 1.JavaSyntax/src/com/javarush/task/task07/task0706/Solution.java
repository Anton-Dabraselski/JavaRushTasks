package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];

        int sumc = 0;
        int sumnc = 0;
        for (int i=0; i<array.length; i++){
            String s = reader.readLine();
            array[i] = Integer.parseInt(s);
                if(i % 2 == 0 || i == 0)
                    sumc = sumc + array[i];
                else
                    sumnc = sumnc + array[i];

        }

        if (sumc > sumnc){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }



    }
}
