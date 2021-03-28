package jg81.projects.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jg81.projects.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
		
	@BeforeEach
	void setUp(){
		  controller = new SetterInjectedController();
		  controller.setGreetingService(new ConstructorGreetingService());
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}
