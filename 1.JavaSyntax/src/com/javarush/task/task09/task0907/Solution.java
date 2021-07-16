package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        System.out.println("Program Starts");

        try {
            System.out.println("Перед ошибочным делением");
            int a = 42 / 0;
            System.out.println("После ошибочного деления");

        }catch (ArithmeticException e){
            System.out.println("ArithmeticException. Exception has been caught");
        }



        //напишите тут ваш код

    }
}
