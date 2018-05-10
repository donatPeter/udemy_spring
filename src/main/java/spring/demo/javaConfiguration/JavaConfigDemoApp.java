/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author mosomaci
 */
public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from the container
		// CoachInterface tennisCoach = context.getBean("tennisCoach",
		// CoachInterface.class);
		CoachInterface swimCoach = context.getBean("swimCoach", CoachInterface.class);

		// call method on the bean
		// System.out.println(tennisCoach.getDailyWorkout());
		// System.out.println(tennisCoach.getDailyFortune());

		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());

		// close the context
		context.close();
	}

}
