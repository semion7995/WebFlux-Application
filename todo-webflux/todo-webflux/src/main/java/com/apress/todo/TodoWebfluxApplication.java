package com.apress.todo;

import com.apress.todo.reactive.ToDoHandler;
import com.apress.todo.reactive.ToDoRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.apress.todo")
public class TodoWebfluxApplication {



	public static void main(String[] args) {
		SpringApplication.run(TodoWebfluxApplication.class, args);
	}



}
