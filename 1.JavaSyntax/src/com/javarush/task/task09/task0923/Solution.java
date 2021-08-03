package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder vow = new StringBuilder();
        StringBuilder noVow = new StringBuilder();
        String s2 = "";
        for (char line : text.toCharArray()){
            if (isVowel(line)){
                vow.append(line + " ");
            }else if (line != ' '){
                noVow.append(line + " ");
            }
        }

        System.out.println(vow.toString());
        System.out.println(noVow.toString());
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}