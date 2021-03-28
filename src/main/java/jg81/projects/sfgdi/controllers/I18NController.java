package jg81.projects.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import jg81.projects.sfgdi.services.GreetingService;

@Controller
public class I18NController {
	private final GreetingService greetingService;
	
	@Autowired
	public I18NController(@Qualifier("i18nService")GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
