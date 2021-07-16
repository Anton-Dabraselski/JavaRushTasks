package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        String line;

        while (!(line = reader.readLine()).equals("end")) {
            list.add(line);
        }
        for (int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        /*
        ИЛИ МОЖНО ВЫВЕСТИ ТАК!

        for (String s : list) {
            System.out.println(s);
        }
         */
        //напишите тут ваш код
    }
}