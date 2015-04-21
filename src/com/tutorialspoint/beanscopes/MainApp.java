package com.tutorialspoint.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopesBeans.xml");

    HelloWorld objA = (HelloWorld) context.getBean("singletonHelloWorld");
    objA.getMessage();
    objA.setMessage("I'm object A");
    objA.getMessage();

    HelloWorld objB = (HelloWorld) context.getBean("singletonHelloWorld");
    objB.getMessage();
  }
}
