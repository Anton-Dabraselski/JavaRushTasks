package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int nn = Integer.parseInt(n);

        if (nn>0)
            System.out.println(nn= nn *2);

        if (nn == 0)
            System.out.println(nn);
        if (nn<0)
            System.out.println(nn = nn +1);

    }

}