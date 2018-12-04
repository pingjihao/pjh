package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.amqp.core.Queue;

@SpringBootApplication
public class SpingbootRabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingbootRabbitApplication.class, args);
	}

	@Bean
	public Queue Queue1(){
		return new Queue("lyhTest1");
	}
}
