package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketTrainer implements  Trainer{

    public CricketTrainer() {
        System.out.println("Cricket Trainer Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Train Straight Drive for 1hr!!!";
    }

}
