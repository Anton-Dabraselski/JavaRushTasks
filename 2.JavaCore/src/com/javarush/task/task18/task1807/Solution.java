package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Scanner;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileInputStream inputStream = new FileInputStream(scanner.nextLine());
        int count = 0;
        while (inputStream.available() > 0){
            char data = (char) inputStream.read();
            if (data == ',') count++;
        }

        inputStream.close();
        System.out.println(count);

    }
}
