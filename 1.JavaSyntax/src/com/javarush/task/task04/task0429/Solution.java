package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i<3; i++){

            int n = Integer.parseInt(reader.readLine());

            if (n>0) count1++;
            if (n<0) count2++;
        }

        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);
    }
}
