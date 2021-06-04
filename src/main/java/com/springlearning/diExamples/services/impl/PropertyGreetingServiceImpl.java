package com.springlearning.diExamples.services.impl;

import com.springlearning.diExamples.services.interfaces.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Property";
    }
}
