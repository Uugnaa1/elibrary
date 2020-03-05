package edu.miu.cs.cs425.demowebapps.elibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"edu.mum.cs.cs425.demowebapps.elibrary.controller"})
public class ElibraryApplication {

	public static void main(String[] args) {
	//	System.setProperty("Server.port","8080");
		SpringApplication.run(ElibraryApplication.class, args);
	}
}
