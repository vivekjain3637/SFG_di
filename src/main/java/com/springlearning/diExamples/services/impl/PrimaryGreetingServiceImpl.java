package com.springlearning.diExamples.services.impl;

import com.springlearning.diExamples.services.interfaces.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World -- Primary";
    }
}
