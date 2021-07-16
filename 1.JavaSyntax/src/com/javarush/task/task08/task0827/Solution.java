package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {

       /* Date yearStartTime = new Date(date);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);
        yearStartTime.setYear();

        Date currentDate = new Date(date);

        long TimeDistance = currentDate.getTime() - yearStartTime.getTime();
        long msDay = 24*60*60*1000;

        int dayCount = (int) (TimeDistance/msDay);

        /*if (dayCount %2 == 0){
            return false;
        }else return true;
        */

       long startTime = new Date(new Date(date).getYear(), 0, 1).getTime();
       long endTime = new Date(date).getTime();

       return (((endTime - startTime)/ (1000*60*60*24)) -1) % 2 !=0;

    }
}
