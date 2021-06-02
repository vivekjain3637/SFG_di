package com.springlearning.diExamples;

import com.springlearning.diExamples.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExamplesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(DiExamplesApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.hellowWorld();
		System.out.println(greeting);
	}

}
