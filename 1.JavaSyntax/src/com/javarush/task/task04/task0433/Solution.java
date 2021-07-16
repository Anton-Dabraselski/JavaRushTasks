package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int i = 0;
        int o = 0;

        while (i!=10) {
            while (o!=9){
                System.out.print("S");
                o++;
            }
            o=0;
            System.out.println("S");
            i++;
        }



    }
}
