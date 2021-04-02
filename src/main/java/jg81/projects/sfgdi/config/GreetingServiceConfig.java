package jg81.projects.sfgdi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import jg81.projects.pets.PetService;
import jg81.projects.pets.PetServiceFactory;
import jg81.projects.sfgdi.FakeDataSource.FakeDataSource;
import jg81.projects.sfgdi.repositories.EnglishGreetingRepository;
import jg81.projects.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import jg81.projects.sfgdi.services.ConstructorGreetingService;
import jg81.projects.sfgdi.services.I18NSpanishService;
import jg81.projects.sfgdi.services.I18nEnglishGreetingService;
import jg81.projects.sfgdi.services.PropertyInjectedGreetingService;
import jg81.projects.sfgdi.services.SetterInjectedGreetingService;
import jg81.projects.sfgdi.services.PrimaryGreetingService;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	FakeDataSource fakeDataSource(@Value("${jg81.username}") String userName, 
								  @Value("${jg81.password}") String password, 
								  @Value("${jg81.jdbcurl}") String jdbcurl) {
		
		FakeDataSource fakeDataSource= new FakeDataSource();

		fakeDataSource.setUserName(userName);
		fakeDataSource.setPassword(password);
		fakeDataSource.setJdbcurl(jdbcurl);
	
		return fakeDataSource;
	}
	@Bean
	PetServiceFactory petServiceFactory() {
		return new PetServiceFactory();
	}
	
	@Profile({"dog","default"})
	@Bean
	PetService dogPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("dog");
	}
	
	@Profile({"cat"})
	@Bean
	PetService catPetService(PetServiceFactory petServiceFactory) {
		return petServiceFactory.getPetService("cat");
	}
	
	
	@Profile({"ES", "default"})
	@Bean("i18nService")
	I18NSpanishService i18NSpanishService() {
		return new I18NSpanishService();
	}
	
	@Bean
	EnglishGreetingRepository  englishGreetingRepository() {
		return new EnglishGreetingRepositoryImpl();
	}
	
	@Profile("EN")
	@Bean("i18nService")
	I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
		return new I18nEnglishGreetingService(englishGreetingRepository);
	}
	
	@Primary
	@Bean
	PrimaryGreetingService primaryGreetingService() {
		return new PrimaryGreetingService();
	}
	
	@Bean
	ConstructorGreetingService constructorGreetingService() {
		return new ConstructorGreetingService();
	}
	
	@Bean
	PropertyInjectedGreetingService propertyInjectedGreetingService() {
		return new PropertyInjectedGreetingService();
	}
	
	@Bean
	SetterInjectedGreetingService setterInjectedGreetingService(){
		return new SetterInjectedGreetingService();
	}
	
}
