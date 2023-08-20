package com.sidhardh.springcore;

import org.springframework.stereotype.Component;

@Component
public class CricketTrainer implements  Trainer{

    @Override
    public String getDailyWorkout() {
        return "Train Straight Drive for 1hrs!!!!";
    }
}
