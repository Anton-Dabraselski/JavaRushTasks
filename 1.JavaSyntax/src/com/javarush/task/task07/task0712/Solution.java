package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<10; i++){
            list.add(reader.readLine());
        }

        for (String x:list){
            if (x.length()>max){
                max=x.length();
            }
            if (x.length()<min){
                min=x.length();
            }
        }
        for (String x:list){
            if (x.length()==max || x.length()==min){
                System.out.println(x);
                break;
            }
        }


    }
}
