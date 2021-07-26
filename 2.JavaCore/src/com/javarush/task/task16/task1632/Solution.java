package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
Клубок
1. Создай 5 различных своих нитей (наследников класса Thread):
1.1. Нить 1 должна бесконечно выполняться;
1.2. Нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. Нить 3 должна каждые полсекунды выводить "Ура";
1.4. Нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. Нить 5 должна читать с консоли числа пока не введено слово "N", а потом вывести в консоль сумму введенных чисел.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        threads.add(thread1);

        Thread2 thread2 = new Thread2();
        threads.add(thread2);

        Thread3 thread3 = new Thread3();
        threads.add(thread3);

        Thread4 thread4 = new Thread4();
        threads.add(thread4);

        Thread5 thread5 = new Thread5();
        threads.add(thread5);
    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread{
        @Override
        public void run() {
            while (true){

            }
        }
    }

    public static class Thread2 extends Thread{
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread{
        @Override
        public void run() {
            while (!isInterrupted()){
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message{

        @Override
        public void run() {
            while (!isInterrupted()){}
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class Thread5 extends Thread{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        String line;
        @Override
        public void run() {
            try {
                while (!(line = reader.readLine()).equals("N")) {
                    number += Integer.parseInt(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(number);
        }

    }
}