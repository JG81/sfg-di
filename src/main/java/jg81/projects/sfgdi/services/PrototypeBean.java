package jg81.projects.sfgdi.services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class PrototypeBean {
	
	public PrototypeBean() {
		System.out.println("Creating a Prototype Bean");
	}

	public String getMyScope() {
		return "I am a Prototype Bean";
	}
}
