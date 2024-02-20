package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
//
//        MyService myService = new MyService();
//        myService.doSomething();

//        MyService myService =  (MyService) appContext.getBean("service");
//        MyService myService2 = (MyService) appContext.getBean("service");
//        MyService myService3 = (MyService) appContext.getBean("service");

//        myService.doSomething();

        Car car1 = (Car) appContext.getBean("car1");

        car1.go();





    }
}