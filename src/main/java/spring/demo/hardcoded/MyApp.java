/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.hardcoded;

/**
 *
 * @author mosomaci
 */
public class MyApp {
    
    public static void main(String[] args) {
        
        // create the object
        Coach bCoach = new TrackCoach();
        
        // use it
        System.out.println(bCoach.getDailyWorkout());
        
    }
    
}
