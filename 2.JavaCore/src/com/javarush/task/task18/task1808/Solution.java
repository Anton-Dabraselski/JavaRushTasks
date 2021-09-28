package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream file1 = new FileInputStream(fileName1);
        FileOutputStream file2 = new FileOutputStream(fileName2);
        FileOutputStream file3 = new FileOutputStream(fileName3);

        int size_file = file1.available();

        byte[] bytes = new byte[file1.available()];
        int count = file1.read(bytes);

        file2.write(bytes, 0, count/2 + count%2);
        file3.write(bytes, count / 2 + count%2, count/2);

        file1.close();
        file2.close();
        file3.close();
        reader.close();

    }
}
