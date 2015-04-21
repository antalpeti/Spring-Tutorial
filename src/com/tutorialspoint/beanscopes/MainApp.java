package com.tutorialspoint.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("BeanScopesBeans.xml");

    examineScope(context, "singletonHelloWorld");
    examineScope(context, "prototypeHelloWorld");
  }

  /**
   * Examine the behavior of the given scope.
   *
   * @param context
   */
  private static void examineScope(ApplicationContext context, String scope) {
    System.out.println("---" + scope + "---");
    HelloWorld objA = (HelloWorld) context.getBean(scope);
    objA.getMessage();
    objA.setMessage("I'm object A");
    objA.getMessage();

    HelloWorld objB = (HelloWorld) context.getBean(scope);
    objB.getMessage();
  }
}
