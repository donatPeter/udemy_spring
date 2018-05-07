package spring.demo.autowired;

import org.springframework.stereotype.Component;

@Component
public class AnotherFortuneService implements FortuneServiceInterface {

	@Override
	public String getFortune() {
		return "Another fortune service message";
	}

}
