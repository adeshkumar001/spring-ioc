package com.mms.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld {
	
	private String message;

	
	
	public HelloWorld(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
