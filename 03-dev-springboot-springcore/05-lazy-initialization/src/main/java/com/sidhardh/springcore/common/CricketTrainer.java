package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketTrainer implements  Trainer{
    public CricketTrainer() {
        System.out.println("Initializing : "+getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Train Straight Drive for 1hr!!!";
    }
}
