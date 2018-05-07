/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mosomaci
 */
public class AnnotationDemoClass {

    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAutoWired.xml");
        
        // get the bean from the container
        CoachInterface tennisCoach = context.getBean("tennisCoach", CoachInterface.class);

        // call method on the bean 
        System.out.println(tennisCoach.getDailyWorkout());
        
        System.out.println(tennisCoach.getDailyFortune());
        
        // close the context
        context.close();
    }

}
