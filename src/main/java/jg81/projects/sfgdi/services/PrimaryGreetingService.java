package jg81.projects.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {

		return "Hello, this is the primary (otherwise acting as default) "
				+ "Bean return text, when no specific implementation of "
				+ "'GreetingService' is defined";
	}

}
