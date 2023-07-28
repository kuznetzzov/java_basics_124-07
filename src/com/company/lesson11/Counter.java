package com.company.lesson11;

public class Counter {
    private int count = 0;

    /**
     * Добавляю ключевое слово synchronized, чтобы только один поток менял значение count
     */
    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
