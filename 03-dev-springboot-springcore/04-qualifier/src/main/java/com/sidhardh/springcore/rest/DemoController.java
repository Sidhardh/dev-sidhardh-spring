package com.sidhardh.springcore.rest;

import com.sidhardh.springcore.common.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency
    private Trainer myTrainer;
    //define a constructer for dependency injection
    @Autowired
    public void DemoController(@Qualifier("footBallTrainer") Trainer theTrainer){
        /*Here we used @Qualifier("footBallTrainer") , alternativly we can make FootBallTrainer as @Primary */
        myTrainer=theTrainer;
    }

    @GetMapping("/getDailyTraining")
    public String getDailyTraining(){
        return myTrainer.getDailyWorkout();
    }


}
