package com.tutorialspoint.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {

    AbstractApplicationContext context =
        new ClassPathXmlApplicationContext("BeanLifeCycleBeans.xml");

    ExampleBean obj1 = (ExampleBean) context.getBean("exampleBean");
    HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
    obj2.getMessage();
    context.registerShutdownHook();
    context.close();
  }
}
