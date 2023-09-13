package com.sidhardh.springcore.common;

public class SwimTrainer implements  Trainer{

    public SwimTrainer() {
        System.out.println("Classs Name : \t"+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meter";
    }
}
