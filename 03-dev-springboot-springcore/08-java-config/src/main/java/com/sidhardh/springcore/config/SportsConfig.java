package com.sidhardh.springcore.config;

import com.sidhardh.springcore.common.SwimTrainer;
import com.sidhardh.springcore.common.Trainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {
    /*methoed name will be default bean id*/
@Bean("aquatic")
public Trainer swimTrainer()
{
    return new SwimTrainer();
}

}
