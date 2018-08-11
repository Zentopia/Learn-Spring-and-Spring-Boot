package com.utopia.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @Autowired
    private MyMessage myMessage;

    @RequestMapping("/")
    public String welcome(){
        return "Hello " + myMessage.getMessageString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
