package spring.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // creating new instance for every getBean
// @Scope("singleton") // creating only one instance
public class TennisCoach implements CoachInterface {

	// private FortuneServiceInterface fortuneService;

	// Autowiring to use field injection
	@Autowired
	@Qualifier("anotherFortuneService")
	private FortuneServiceInterface fortuneService; 

	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach constructor");
	}

	// autowiring the fortuneServiceInterface by either constructor or setter
	// injection or using any custom method name with the autowire annotation

	// @Autowired
	// public TennisCoach(FortuneServiceInterface fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	// @Autowired
	// public void setFortuneService(FortuneServiceInterface fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	// @Autowired
	// public void itCanBeCalledAnyhow(FortuneServiceInterface fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	@Override
	public String getDailyWorkout() {
		return "practice hard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
