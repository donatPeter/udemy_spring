package spring.demo.javaConfiguration;

import spring.demo.javaConfiguration.CoachInterface;

public class SwimCoach implements CoachInterface {

	private FortuneServiceInterface fortuneService;
	
	public SwimCoach(FortuneServiceInterface fortuneServiceInterface) {
		this.fortuneService = fortuneServiceInterface;
	}
	
	@Override
	public String getDailyWorkout() {
		return "SwimCoach getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
