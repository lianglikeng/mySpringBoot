package com.sptringboot;

import com.sptringboot.pojo.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication()
public class MainApplication {
    public static void main(String [] args){
       ConfigurableApplicationContext run=SpringApplication.run(MainApplication.class,args);
       Car car=run.getBean(Car.class);
       System.out.println(car);
    }
}
