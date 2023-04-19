package com.ejercicio1.bootcamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {
	@Value("${course.message}")
	private String menssage;

	
	public String getMessage() {
		return menssage;
	}

}
