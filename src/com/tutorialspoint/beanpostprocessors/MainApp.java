package com.tutorialspoint.beanpostprocessors;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {

    AbstractApplicationContext context =
        new ClassPathXmlApplicationContext("BeanPostProcessorsBeans.xml");

    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
    context.registerShutdownHook();
  }
}
