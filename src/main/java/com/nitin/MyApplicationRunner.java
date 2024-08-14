package com.nitin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Value("${value.type}")
    private String file;
    @Override
public void run(ApplicationArguments args) {
    System.out.println("MyApplicationRunner run() method called by IOC Container ");
    System.out.println("@value annotation se inject karwa di value " + file);
}
}
