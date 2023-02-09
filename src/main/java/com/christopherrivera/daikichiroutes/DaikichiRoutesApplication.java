package com.christopherrivera.daikichiroutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	
	// 1. Annotation
    @GetMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Welcome!";
    }
    
    @GetMapping("/daikichi")
    // 3. Method that maps to the request route above
    public String daikichi() { // 3
            return "Welcome!";
    }
    
    @GetMapping("/daikichi/today")
    // 3. Method that maps to the request route above
    public String today() { // 3
            return "Today you will find luck in all your endeavors!";
    }
    
    @GetMapping("/daikichi/tomorrow")
    // 3. Method that maps to the request route above
    public String tomorrow() { // 3
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }
}
