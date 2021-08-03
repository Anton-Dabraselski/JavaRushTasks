package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
