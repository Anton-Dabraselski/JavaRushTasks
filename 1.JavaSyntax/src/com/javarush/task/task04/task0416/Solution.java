package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String xs = reader.readLine();
        double x = Double.parseDouble(xs);

        while (x >= 5) {
            x = x - 5;
        }
        String a = null;
        if (x < 3)
            a = "зелёный";
        if ((x >= 3) & (x < 4))
            a = "жёлтый";
        if ((x >= 4) & (x < 5))
            a = "красный";

        System.out.println(a);
    }
}