package com.sidhardh.dev.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestWebCalls {

    @Value("${work.location}")
    private String location;
    @Value("${work.place}")
    private String place;
    @Value("${work.time}")
    private String time;
    @Value("${spring-boot.props}")
    private String props;
    @GetMapping("/getResponse")
    public String getSampleResponse(){
        return "Sample Response";
    }
    @GetMapping("/customResponse")
    public List<String> getCustomResponse(){
        List<String> myList=new ArrayList<String>();
        myList.add("Location :"+ location);
        myList.add("Plcae :"+ place);
        myList.add("Time :"+ time);
        myList.add("Spring boot Props : "+props);
        return myList;
    }
}
