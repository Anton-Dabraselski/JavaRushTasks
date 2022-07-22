package com.javarush.task.task18.task1816;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* 
Английские буквы

В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetH = alphabetL.toUpperCase();

        FileReader fileReader = new FileReader(args[0]);

        int count = 0;
        while (fileReader.ready()){
            char c = (char) fileReader.read();
            if ((alphabetL.indexOf(c) > -1) || (alphabetH.indexOf(c) > -1)){
                count++;
            }
        }
        fileReader.close();
        System.out.println(count);
    }
}
