package jg81.projects.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jg81.projects.sfgdi.FakeDataSource.FakeDataSource;
import jg81.projects.sfgdi.controllers.*;
import jg81.projects.sfgdi.services.PrototypeBean;
import jg81.projects.sfgdi.services.SingletonBean;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());
		
		System.out.println();
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
		System.out.println();
		
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------ Primary Bean");
		System.out.println(myController.sayHello());
		
		System.out.println();
		
		System.out.println("------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println();
		
		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println();
		
		System.out.println("------- Constructor" );
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
		System.out.println();
		
		SingletonBean singletonBean1 = (SingletonBean) ctx.getBean("singletonBean");
		System.out.println(singletonBean1);
		System.out.println(singletonBean1.getMyScope());
		
		SingletonBean singletonBean2 = (SingletonBean) ctx.getBean("singletonBean");
		System.out.println(singletonBean2);
		System.out.println(singletonBean2.getMyScope());
		
		System.out.println();
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1);
		System.out.println(prototypeBean1.getMyScope());
		
		System.out.println();
		
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2);
		System.out.println(prototypeBean2.getMyScope());
		
		System.out.println();
		
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource.getUserName());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcurl());
		
		System.out.println();
	}

}
