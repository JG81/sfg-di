package jg81.projects.sfgdi.controllers;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jg81.projects.sfgdi.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp(){
		
		controller= new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
		
	}

}
