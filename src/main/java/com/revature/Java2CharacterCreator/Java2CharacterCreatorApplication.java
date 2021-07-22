package com.revature.Java2CharacterCreator;

import com.revature.controller.CharacterController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @ComponentScan(basePackageClasses = CharacterController.class)
public class Java2CharacterCreatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java2CharacterCreatorApplication.class, args);
	}

}
