package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i=0; i<5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for(int j = 0; j < 5 ; j++){
            for( int i = 0; i < numbers.length - 1; i++){
                if(numbers[i] > numbers[i+1]){
                    int a = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = a;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //напишите тут ваш код
    }
}
