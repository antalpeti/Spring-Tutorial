package com.tutorialspoint.beandefinitioninheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("BeanDefinitionInheritance.xml");

    HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

    objA.getMessage1();
    objA.getMessage2();

    HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
    objB.getMessage1();
    objB.getMessage2();
    objB.getMessage3();

    HelloIndia objC = (HelloIndia) context.getBean("helloIndiaAgain");
    objC.getMessage1();
    objC.getMessage2();
    objC.getMessage3();
  }
}
