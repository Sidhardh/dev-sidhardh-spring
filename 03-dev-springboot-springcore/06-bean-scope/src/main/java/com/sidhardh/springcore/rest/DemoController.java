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
    private Trainer yourTrainer;
    //define a constructer for dependency injection
    @Autowired
    public void DemoController(@Qualifier("footBallTrainer") Trainer theTrainer,
                               @Qualifier("footBallTrainer") Trainer otherTrainer){
        myTrainer=theTrainer;
        yourTrainer=otherTrainer;
    }

    @GetMapping("/getDailyTraining")
    public String getDailyTraining(){
        return myTrainer.getDailyWorkout();
    }

    @GetMapping("/checkBeanScope")
    public String checkBeanScope(){
        return  "Comparing  myTrainer==yourTrainer \t  Singleton  \t: "+ (myTrainer==yourTrainer);
    }


}
