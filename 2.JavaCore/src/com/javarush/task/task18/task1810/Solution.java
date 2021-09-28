package com.javarush.task.task18.task1810;

import java.io.*;
import java.util.Scanner;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        final int max_size = 1000;
        while (true){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = bufferedReader.readLine();
            FileInputStream file = new FileInputStream(fileName);

            int size = file.available();
            file.close();
            bufferedReader.close();
            if (size < max_size){
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
