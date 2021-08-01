package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String file1 = scanner.nextLine();
                    //"d:\\first.txt";
            String file2 = scanner.nextLine();
                    // "d:\\second.txt";

            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));

            while (reader.ready()){
                allLines.add(reader.readLine());
            }
            reader.close();
            while (reader2.ready()){
                forRemoveLines.add(reader2.readLine());
            }
            reader2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.printf("Something doesnt work :/");
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
