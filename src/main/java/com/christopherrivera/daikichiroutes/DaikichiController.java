package com.christopherrivera.daikichiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiController {

	// 1. Annotation
    @RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Welcome!";
    }
    
    @RequestMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String daikichi() { // 3
            return "Welcome!";
    }
    
    @RequestMapping("/daikichi/today")
    // 3. Method that maps to the request route above
    public String today() { // 3
            return "Today you will find luck in all your endeavors!";
    }
    
    @RequestMapping("/daikichi/tomorrow")
    // 3. Method that maps to the request route above
    public String tomorrow() { // 3
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
    
    @RequestMapping("/daikichi/travel/{location}")
    public String showLesson(@PathVariable("location") String location){
    	return "Congratulations! You will soon travel to " + location + "!";
    }
    
    @RequestMapping("/daikichi/lotto/{number}")
    public String showLesson(@PathVariable("number") int number){
    	if(number % 2 == 0) {
    		return "You will take a grand journey in the near future, but be weary of tempting offers.";
    	}
    	else {
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    	}
    }
}