package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        FileInputStream f = new FileInputStream(scanner.nextLine());

        int max = 0;
        if (f.available() > 0)
            max = f.read();
        while (f.available() > 0) {
            int value = f.read();
            if (max < value)
                max = value;
        }
        System.out.println(max);
        f.close();

    }
}
