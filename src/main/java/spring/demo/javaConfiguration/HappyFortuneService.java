package spring.demo.javaConfiguration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServiceInterface {

	@Override
	public String getFortune() {
		return "today is your lucky day";
	}

}
