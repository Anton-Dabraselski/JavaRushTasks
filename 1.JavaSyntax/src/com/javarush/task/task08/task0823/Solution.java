package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //напишите тут ваш код
        String[] slova = s.split("\\s+"); //разделяем на массив из слов
        String ouput = "";//все слова с заглавной буквы.
        for (String Slova: slova){
            if (Slova.length() > 0){
            String first = Slova.substring(0,1).toUpperCase() ;
            String all = Slova.substring(1);
            ouput+=first+all + " ";}
        }
        System.out.println(ouput);
    }
}
