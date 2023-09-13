package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyTrainer implements  Trainer{
    @Override
    public String getDailyWorkout() {
        return "Play Hockey 10 minutes";
    }
}
