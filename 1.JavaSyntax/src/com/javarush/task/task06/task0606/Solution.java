package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine().toString();

        for (int i = 0; i< a.length(); i++){
            int x = Integer.parseInt(a.substring(i, i+1));
            if (x%2==0){
                even++;
            }else odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
