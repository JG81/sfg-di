package jg81.projects.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import jg81.projects.sfgdi.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
