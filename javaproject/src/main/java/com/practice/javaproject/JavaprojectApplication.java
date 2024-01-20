package com.practice.javaproject;

import config.Beanconfig;
import model.Coder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Beanconfig.class)
public class JavaprojectApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JavaprojectApplication.class, args);
        Coder c1 = (Coder) context.getBean("coder");
        System.out.println(c1.getId());
        System.out.println(c1.getName());
        System.out.println(c1.getLanguage());
        System.out.println(c1.getComputer().getBrand());

        Coder c2 = (Coder) context.getBean("coder1");
        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getLanguage());
        System.out.println(c2.getComputer().getBrand());
    }

}
