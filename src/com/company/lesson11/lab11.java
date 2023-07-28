package com.company.lesson11;

import java.util.ArrayList;
import java.util.List;

public class lab11 {
    public static void main(String[] args) {

        ThreadDeals threadDeals = new ThreadDeals();

        /**
         * Напишите программу, в которой запускается 10 потоков и каждый из них выводит
         * числа от 0 до 100.
         *
         * Выведете состояние потока перед его запуском, после запуска и во время
         * выполнения.
         */
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new ThreadDeals());
            thread.setName("Thread " + i);
            System.out.println(thread.getName() + " состояние перед запуском: " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + " состояние после запуска: " + thread.getState());
            try {
                Thread.sleep(100); // Приостановка для наблюдения состояния потока
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + " состояние в момент исполнения: " + thread.getState());
        }

        /**
         * Дан класс:
         * class Counter {
         *      int count = 0;
         *
         *     public void increment() {
         *         count = count + 1;
         *     }
         *     public int getCount() {
         *      return count;
         * }
         * }
         *
         * Напишите программу, в которой запускается 100 потоков, каждый из которых
         * вызывает метод increment() 1000 раз.
         * После того, как потоки завершат работу count должен быть равен 100000 при  каждом запуске программы .
         * Если обнаружилась проблема, предложите ее решение.
         */
        Counter counter = new Counter();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("count: " + counter.getCount());


        /**
         * Напишите программу, в которой создаются два потока, каждый из которых выводит
         * по очереди на консоль своё имя.
         * Начать можно с написания своего класс-потока, который выводит в бесконечном
         * цикле свое имя. Потом придется добавить синхронизацию с помощью wait() и
         * notify().
         */
        Thread thread1 = new Thread1(threadDeals);
        Thread thread2 = new Thread2(threadDeals);
        thread1.start();
        thread2.start();
    }
}
