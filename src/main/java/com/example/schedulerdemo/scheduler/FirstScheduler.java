package com.example.schedulerdemo.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FirstScheduler {

    @Async("asyncTaskExecutor")
    @Scheduled(fixedRate = 1 * 60 * 1000) // Runs every 1 minutes
    public void getDataFromDB() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" : start 1st scheduler.");
        // Your code to get data from the DB
        for(int i = 1; i<=20; i++) {
            Thread.sleep(1000);
            System.out.println("1st scheduler : " + i);
        }
        System.out.println(Thread.currentThread().getName()+" : End 1st scheduler.");
    }
}
