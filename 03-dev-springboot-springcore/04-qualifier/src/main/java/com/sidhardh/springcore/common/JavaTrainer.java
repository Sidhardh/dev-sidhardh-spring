package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class JavaTrainer implements Trainer{
    @Override
    public String getDailyWorkout() {
        return "Learn Java 30 minutes Daily";
    }
}
