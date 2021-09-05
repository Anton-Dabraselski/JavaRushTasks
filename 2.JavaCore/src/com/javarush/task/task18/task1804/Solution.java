package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Самые редкие байты

Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        FileInputStream file = new FileInputStream(scanner.nextLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        Integer count = 0;
        int data = 0;

        while (file.available() > 0){
            data = file.read();

            count = map.get(data);

            if(count != null){
                count++;
            }else {
                count = 0;
            }

            map.put(data, count);
        }
        file.close();

        //search min
        boolean first = true;
        int min = 0;

        for (int amountByte : map.values()){
            if (first){
                min = amountByte;
                first = false;
            }
            if (min > amountByte)
                min = amountByte;
        }

        //print
        for (Map.Entry pair : map.entrySet()) {
            if (min == (int) pair.getValue())
                System.out.print(" " + pair.getKey());
        }

    }
}
