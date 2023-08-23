package com.sidhardh.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootBallTrainer  implements  Trainer{

    @Override
    public String getDailyWorkout() {
        return "Practice Foot Ball for 10 minutes..";
    }
}
