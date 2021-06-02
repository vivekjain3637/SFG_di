package com.springlearning.diExamples.services.impl;

import com.springlearning.diExamples.services.interfaces.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
