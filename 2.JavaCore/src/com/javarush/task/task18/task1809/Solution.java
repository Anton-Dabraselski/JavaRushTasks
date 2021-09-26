package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        FileInputStream file1 = new FileInputStream(scanner.nextLine());
        FileOutputStream file2 = new FileOutputStream(scanner.nextLine());

        while (file1.available() > 0){
            byte[] buffer = new byte[file1.available()];
            byte[] reverseBuffer = new byte[buffer.length];

            file1.read(buffer);

            for (int i = buffer.length-1; i >= 0; i--) {
                reverseBuffer[buffer.length - i - 1] = buffer[i];
            }
            file2.write(reverseBuffer);
        }
        file1.close();
        file2.close();
    }
}
