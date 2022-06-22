package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.devs4j.di.profiles.EnvironmentService;
import com.devs4j.di.qualifiers.Nido;

@SpringBootApplication
public class DependencyInyectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);

		// Nido nido=context.getBean( Nido.class);
		// nido.imprimir();

		EnvironmentService environmentService = context.getBean(EnvironmentService.class);
		log.info("Active environment {}", environmentService.getEnvironment());

	}

}
