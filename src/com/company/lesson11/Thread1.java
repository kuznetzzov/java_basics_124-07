package com.company.lesson11;

public class Thread1 extends Thread {

    private ThreadDeals threadDeals;

    public Thread1(ThreadDeals threadDeals) {
        this.threadDeals = threadDeals;
    }

    @Override
    public void run() {
        while (true) {
            threadDeals.printMyName("Thread1");
        }
    }
}
