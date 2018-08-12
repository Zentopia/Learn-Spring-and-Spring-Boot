package com.utopia.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@EnableConfigurationProperties(value = MyMessage.class)
public class Application {

    @Autowired
    private MyMessage myMessage;

    @Autowired
    ApplicationArguments args;

    @RequestMapping("/")
    public String welcome(){

        String value = args.getOptionNames().iterator().next();
        return "Welcome " + value;

//        return "Hello " + myMessage.getMessageValue();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
