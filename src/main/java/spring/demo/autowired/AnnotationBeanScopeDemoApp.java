package spring.demo.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAutoWired.xml");

		// retrieve bean from spring container
		CoachInterface tennisCoach = context.getBean("tennisCoach", CoachInterface.class);
		CoachInterface anotherCoach = context.getBean("tennisCoach", CoachInterface.class);

		// check if those are the same object
		System.out.println("pointing the same object: " + (tennisCoach == anotherCoach));
		System.out.println("memory locations: " + tennisCoach + " | " + anotherCoach);

		// close context
		context.close();

	}

}
