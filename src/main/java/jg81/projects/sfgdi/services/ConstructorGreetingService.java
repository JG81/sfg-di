package jg81.projects.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello, Contructor Injected Service";
	}

}
