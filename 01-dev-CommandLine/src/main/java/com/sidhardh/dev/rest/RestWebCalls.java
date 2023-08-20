package com.sidhardh.dev.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebCalls {

    @GetMapping("/getResponse")
    public String getSampleResponse(){
        return "Sample Response";
    }
}
