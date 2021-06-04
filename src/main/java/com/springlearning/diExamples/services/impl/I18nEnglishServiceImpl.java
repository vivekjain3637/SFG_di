package com.springlearning.diExamples.services.impl;

import com.springlearning.diExamples.services.interfaces.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("i18nService")
public class I18nEnglishServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
