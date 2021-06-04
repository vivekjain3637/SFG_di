package com.springlearning.diExamples.controllers;

import com.springlearning.diExamples.services.interfaces.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String hellowWorld(){
        return greetingService.sayGreeting();
    }
}
