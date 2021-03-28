package jg81.projects.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jg81.projects.sfgdi.controllers.ConstructorInjectedController;
import jg81.projects.sfgdi.controllers.I18NController;
import jg81.projects.sfgdi.controllers.MyController;
import jg81.projects.sfgdi.controllers.PropertyInjectedController;
import jg81.projects.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(SfgDiApplication.class, args);
		
		I18NController i18n = 
				(I18NController)ctx.getBean("i18NController");
		
		System.out.println(i18n.sayHello());
		
		System.out.println("-------------- Property");
		
		PropertyInjectedController piController = 
				(PropertyInjectedController)ctx.getBean("propertyInjectedController");
		
		System.out.println(piController.getGreeting());
		
		System.out.println("-------------- Setter");
		
		SetterInjectedController siController =
				(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(siController.getGreeting());
		
		System.out.println("-------------- Constructor");
		
		ConstructorInjectedController ciController=
				(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(ciController.getGreeting());
		
		System.out.println("-------------- Primary Bean response");
		
		MyController myController = (MyController)ctx.getBean("myController");
		System.out.println(myController.sayHello());
	}

}
