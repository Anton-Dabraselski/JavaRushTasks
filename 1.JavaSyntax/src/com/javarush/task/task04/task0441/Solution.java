package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[3];

            for (int i =0; i<3; i++) {
                a[i] = Integer.parseInt(reader.readLine());
            }
        Arrays.sort(a);

        System.out.println(a[1]);
            }
    }

