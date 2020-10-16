package io.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication -- this tells that this is the main class to launch the application
@SpringBootApplication  
public class CourseApiDataApp {

	public static void main(String[] args) {
		//SpringApplication.run(source,args) this static method run()  deploy the servletContainer need for server deployment 
				SpringApplication.run(CourseApiDataApp.class, args);

	}

}
