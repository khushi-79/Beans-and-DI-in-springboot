package com.khushi.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		//this context is having object inside JVM and it can only access if there is @Component annotation in class
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

//		MyClass obj = new MyClass(); //it creates inside jvm not inside IoC container

		MyClass obj = context.getBean(MyClass.class);

		obj.build();
	}

}
