package spring.demo.javaConfiguration;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("spring.demo.javaConfiguration") // we can use either automatic component scan or define manually beans
public class SportConfig {

	// define bean for the service
	@Bean
	public FortuneServiceInterface anotherFortuneService() {
		return new AnotherFortuneService();
	}

	// define bean for the coach and inject dependencies
	@Bean
	public CoachInterface swimCoach() {
		return new SwimCoach(anotherFortuneService());
	}

}
