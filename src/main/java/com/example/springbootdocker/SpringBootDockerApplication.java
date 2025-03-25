package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDockerApplication {

    @RequestMapping("/server/v2/RegulatedAuthorization/fa5a7413-a19e-4524-8fd6-ced86f64038b")
    public String home() {
        return "[{id:fa5a7413-a19e-4524-8fd6-ced86f64038b,name:AMGEN}]";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

}
