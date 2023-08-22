package com.sidhardh.springcore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //define a private field for dependency
    private Trainer myTrainer;
    //define a constructer for dependency injection
    @Autowired
    public DemoController(Trainer theTrainer){
        myTrainer=theTrainer;
    }

    @GetMapping("/getDailyTraining")
    public String getDailyTraining(){
        return myTrainer.getDailyWorkout();
    }


}
