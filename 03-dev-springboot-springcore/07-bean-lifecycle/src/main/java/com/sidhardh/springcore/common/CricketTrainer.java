package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class CricketTrainer implements  Trainer{

    public CricketTrainer() {
        System.out.println("Cricket Trainer Constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Train Straight Drive for 1hr!!!";
    }
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("doMyStartupStuff() : \t"+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleaningStuff()
    {
        System.out.println("doMyCleaningStuff() : \t"+getClass().getSimpleName());
    }
}
