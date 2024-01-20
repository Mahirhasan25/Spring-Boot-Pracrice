package com.practice.autowired.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype")
@Component
public class Coder {
    public String name;
    @Autowired
    Computer computer;
    public Coder() {
        System.out.println("no - args");
    }
    public void print() {
        computer.brand();
    }


}
