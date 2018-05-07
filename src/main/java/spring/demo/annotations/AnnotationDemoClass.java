/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author mosomaci
 */
public class AnnotationDemoClass {

    public static void main(String[] args) {

        // read the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // get the bean from the container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // call method on the bean 
        System.out.println(tennisCoach.getDailyWorkout());
        
        // close the context
        context.close();
    }

}
