package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        if (a > b && a > c && a > e) {
            System.out.println(a);
        } else if (b > a && b > c && b > e) {
            System.out.println(b);
        }  else if (c > a && c > b && c > e) {
            System.out.println(c);
        }  else if (e > a && e > c && e > b) {
            System.out.println(e);
        } else System.out.println(a);



    }
}
