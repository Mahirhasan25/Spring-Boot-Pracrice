package com.practice.autowired.model;

import org.springframework.stereotype.Component;

@Component
public class Computer {

    public Computer() {
        System.out.println("no - args");
    }
     public void brand() {
        System.out.println("windows");
    }
}
