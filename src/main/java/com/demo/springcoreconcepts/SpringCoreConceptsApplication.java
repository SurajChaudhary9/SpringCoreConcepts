package com.demo.springcoreconcepts;

import com.demo.springconcepts.component.DemoBean;
import com.demo.springcoreconcepts.components.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean = "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
	}

}