package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла,
    а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        reader.close();

        FileOutputStream outputFile1 = new FileOutputStream(filename1);
        FileInputStream inputFile2 = new FileInputStream(filename2);
        FileInputStream inputFile3 = new FileInputStream(filename3);

        byte[] bytesFile2 = new byte[inputFile2.available()];
        byte[] bytesFile3 = new byte[inputFile3.available()];

        inputFile2.read(bytesFile2);
        inputFile3.read(bytesFile3);

        outputFile1.write(bytesFile2);
        outputFile1.write(bytesFile3);

        inputFile2.close();
        inputFile3.close();
        outputFile1.close();
    }
}
