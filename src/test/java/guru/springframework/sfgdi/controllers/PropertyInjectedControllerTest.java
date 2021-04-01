package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jg81.projects.sfgdi.controllers.PropertyInjectedController;
import jg81.projects.sfgdi.services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}