package com.tutorialspoint.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {

    AbstractApplicationContext context =
        new ClassPathXmlApplicationContext("BeanLifeCycleBeans.xml");

    ExampleBean obj = (ExampleBean) context.getBean("exampleBean");
    context.registerShutdownHook();
    context.close();
  }
}
