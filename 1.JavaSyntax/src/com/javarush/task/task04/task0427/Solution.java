package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        int i = s.length();
        int a = Integer.parseInt(s);

        if (a < 1000 && a > 0){

            if (i == 1 && a%2 == 0){
                System.out.println("четное однозначное число");
            }else if (i== 1 && !(a%2==0)){
                System.out.println("нечетное однозначное число");
            }else if (i == 2 && a%2==0){
                System.out.println("четное двузначное число");
            }else if (i==2 && !(a%2==0)){
                System.out.println("нечетное двузначное число");
            }else if (i==3 && a%2==0){
                System.out.println("четное трехзначное число");
            }else if (i==3 && !(a%2==0)){
                System.out.println("нечетное трехзначное число");
            }


        }

    }
}
