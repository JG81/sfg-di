package jg81.projects.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello, Property Injected Service";
	}

}
