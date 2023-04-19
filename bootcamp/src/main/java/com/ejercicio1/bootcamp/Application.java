package com.ejercicio1.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
//		final AbstractApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//		final UserService usuario = context.getBean(UserService.class);
//		final long count = usuario.count();
//		System.out.println(count);
		//final Account account = accountService.findAccountByName("Jane");
}

}
