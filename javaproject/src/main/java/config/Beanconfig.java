package config;

import model.Coder;
import model.Computer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beanconfig {
    @Bean
    public Coder coder (@Qualifier("computer1") Computer computer) {
        Coder c1 = new Coder();
        c1.setId(1);
        c1.setName("Asik");
        c1.setLanguage("Python");
        c1.setComputer(computer);
        return  c1;
    }
    @Bean
    public Computer computer() {
        Computer com = new Computer();
        com.setBrand("Linux");
        return  com;
    }
    @Bean
    public Coder coder1 (@Qualifier("computer") Computer computer) {
        Coder c1 = new Coder();
        c1.setId(1);
        c1.setName("Sala");
        c1.setLanguage("Django");
        c1.setComputer(computer);
        return  c1;
    }
    @Bean
    public Computer computer1() {
        Computer com = new Computer();
        com.setBrand("Widows");
        return  com;
    }
}
