package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] BigArray = new int[20];
        int[] FirstArray = new int[10];
        int[] SecondArray = new int[10];

        for (int i =0; i<BigArray.length; i++){
            String s = reader.readLine();
            BigArray[i] = Integer.parseInt(s);
        }

        for (int y=0; y<10; y++){
            FirstArray[y] = BigArray[y];
        }
        int r=0;
        for (int x=10; x<20; x++){
            SecondArray[r] = BigArray[x];
            System.out.println(SecondArray[r]);
            r++;
        }

       /*System.arraycopy(BigArray, 5, FirstArray, 10, 0);
       for (int i=0; i<FirstArray.length;i++){
           System.out.println(FirstArray[i]);
       }*/
    }
}
