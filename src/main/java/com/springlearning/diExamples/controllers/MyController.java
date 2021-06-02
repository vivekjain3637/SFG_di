package com.springlearning.diExamples.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hellowWorld(){
        System.out.println("Hello World");
        return "hello!";
    }
}
