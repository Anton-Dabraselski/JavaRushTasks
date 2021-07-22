package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("helicopter")){
            result = new Helicopter();
        }else if(input.equals("plane")){
            System.out.println("Write number of passengers: ");
            int input2 = scanner.nextInt();
            result = new Plane(input2);
        }
        scanner.close();
    }
}
