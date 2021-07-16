package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a == b && a !=c){
            System.out.println(3);
        }else if (a == c && b != c){
            System.out.println(2);
        }else if (c == b && c != a )
            System.out.println(1);



    }
}
