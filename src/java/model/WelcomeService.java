/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author Taylor
 */
public class WelcomeService {
    private final LocalDateTime currentDate = LocalDateTime.now();
    
    private String findTimeOfDay(){
        int hour = currentDate.getHour();
        int minute = currentDate.getMinute();
        String timeOfDay;
        if(hour < 11){
            timeOfDay = "Good Morning";
        }else if (hour >= 11 && hour < 17){
            timeOfDay = "Good Afternoon";
        }else if(hour >= 17){
            timeOfDay = "Good Evening";
        }else{
            timeOfDay = "Error";
        }
        return timeOfDay;
    }
    
    public String getGreeting(String name){
        String timeOfDay = findTimeOfDay();
        String msg = timeOfDay + " " + name + ", welcome!";
        return msg;
    }
}
