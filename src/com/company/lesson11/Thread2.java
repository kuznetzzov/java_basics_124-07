package com.company.lesson11;

public class Thread2 extends Thread {

    private ThreadDeals threadDeals;

    public Thread2(ThreadDeals threadDeals) {
        this.threadDeals = threadDeals;
    }

    @Override
    public void run() {
        while (true) {
            threadDeals.printMyName("Thread2");
        }
    }
}
