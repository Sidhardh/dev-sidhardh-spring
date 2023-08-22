package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
//@Primary - if we are not using @Qualifier
public class HockeyTrainer implements  Trainer{

    @Override
    public String getDailyWorkout() {
        return "Play Hockey 10 minutes";
    }
}
