package com.springlearning.diExamples.controllers;

import com.springlearning.diExamples.services.interfaces.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
