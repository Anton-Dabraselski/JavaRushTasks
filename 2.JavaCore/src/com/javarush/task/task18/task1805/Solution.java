package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт

Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        FileInputStream file = new FileInputStream(scanner.nextLine());

        //ArrayList<Integer> arrayList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        while (file.available() > 0){
            int data = file.read();
            set.add(data);
        }
        file.close();

        List list = new ArrayList(set);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }
}
