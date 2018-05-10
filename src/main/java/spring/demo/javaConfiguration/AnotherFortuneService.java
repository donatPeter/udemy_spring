package spring.demo.javaConfiguration;

import spring.demo.javaConfiguration.FortuneServiceInterface;

public class AnotherFortuneService implements FortuneServiceInterface {

	@Override
	public String getFortune() {
		return "AnotherFortuneService";
	}

}
