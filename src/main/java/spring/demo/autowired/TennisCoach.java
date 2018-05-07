package spring.demo.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements CoachInterface {

	private FortuneServiceInterface fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach constructor");
	}

	// autowiring the fortuneServiceInterface by either constructor or setter injection

	// @Autowired
	// public TennisCoach(FortuneServiceInterface fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	@Autowired
	public void setFortuneService(FortuneServiceInterface fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice hard";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}