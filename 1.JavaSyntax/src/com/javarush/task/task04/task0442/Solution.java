package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        int sum = 0;

        while (true){

            int n = Integer.parseInt(reader.readLine());

            if(n== -1){
                sum = sum + (-1);
                break;
            }
            sum = sum + n;
            i++;
        }
        System.out.println(sum);
    }
}
