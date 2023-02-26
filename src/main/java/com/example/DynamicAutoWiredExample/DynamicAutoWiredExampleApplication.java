package com.example.DynamicAutoWiredExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicAutoWiredExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynamicAutoWiredExampleApplication.class, args);
		BeanFactoryDynamicAutowireService beanFactoryDynamicAutowireService=new BeanFactoryDynamicAutowireService();

	}

}
