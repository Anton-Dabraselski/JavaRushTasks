package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Write your file name");

        FileInputStream file = new FileInputStream(scanner.nextLine());

        int min = 0;
        if (file.available() > 0) min = file.read();

        while (file.available() > 0){
            int data = file.read();
            if(data < min)  min = data;
        }

        System.out.println(min);
        file.close();
    }
}
