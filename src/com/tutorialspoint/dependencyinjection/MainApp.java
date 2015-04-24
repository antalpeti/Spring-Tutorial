package com.tutorialspoint.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionBeans.xml");

    TextEditor te = (TextEditor) context.getBean("textEditor");

    te.spellCheck();

    Foo foo = (Foo) context.getBean("fooRef");
    foo = (Foo) context.getBean("fooType");
    foo = (Foo) context.getBean("fooIndex");
    foo = (Foo) context.getBean("fooName");
  }
}
