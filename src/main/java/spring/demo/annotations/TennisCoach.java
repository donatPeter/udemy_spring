/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.demo.annotations;

import org.springframework.stereotype.Component;

/**
 *
 * @author mosomaci
 */
@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice";
    }

}
