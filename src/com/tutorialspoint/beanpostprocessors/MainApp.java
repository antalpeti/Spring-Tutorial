package com.tutorialspoint.beanpostprocessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {

    AbstractApplicationContext context =
        new ClassPathXmlApplicationContext("BeanPostProcessorsBeans.xml");

    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
    Person obj1 = (Person) context.getBean("person");
    System.out.println("Your Name: " + obj1.getName());
    System.out.println("Your Age: " + obj1.getAge());

    context.registerShutdownHook();
  }
}
