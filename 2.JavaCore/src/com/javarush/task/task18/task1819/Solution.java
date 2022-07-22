package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов

Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        try (FileInputStream fileInput1 = new FileInputStream(file1);
                FileInputStream fileInput2 = new FileInputStream(file2)){
            byte[] bytesFile1 = new byte[fileInput1.available()];
            fileInput1.read(bytesFile1);

            byte[] bytesFile2 = new byte[fileInput2.available()];
            fileInput2.read(bytesFile2);

            FileOutputStream fileOutput = new FileOutputStream(file1);
            fileOutput.write(bytesFile2);
            fileOutput.write(bytesFile1);

            fileInput1.close();
            fileInput2.close();
            fileOutput.close();
        }
    }
}
