package com.sidhardh.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class FootBallTrainer  implements  Trainer{
    @Override
    public String getDailyWorkout() {
        return "Practice Foot Ball for 10 minutes..";
    }
}
