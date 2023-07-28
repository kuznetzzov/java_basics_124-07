package com.company.lesson11;

public class ThreadDeals implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " до запуска.");
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        System.out.println(Thread.currentThread().getName() + " после остановки.");
    }


    private boolean isSynch = true;

    public synchronized void printMyName(String name) {
        while (isSynch = false) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name);
        isSynch = false;
        notify();
    }
}
