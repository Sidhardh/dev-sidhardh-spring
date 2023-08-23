package com.sidhardh.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CricketTrainer implements  Trainer{

    @Override
    public String getDailyWorkout() {
        return "Train Straight Drive for 1hr!!!";
    }
}
