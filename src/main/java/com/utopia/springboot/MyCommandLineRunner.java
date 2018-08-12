package com.utopia.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.print("There are the arguments used to start the app:");
        for (String arg: args ){
            System.out.print(arg);
        }

    }
}
