package com.tutorialspoint.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("DependencyInjectionBeans.xml");

    System.out.println("Constructor-Based:");
    TextEditor te = (TextEditor) context.getBean("textEditorConstr");

    te.spellCheck();

    Foo foo = (Foo) context.getBean("fooRef");
    foo = (Foo) context.getBean("fooType");
    foo = (Foo) context.getBean("fooIndex");
    foo = (Foo) context.getBean("fooName");

    System.out.println("Setter-Based:");
    te = (TextEditor) context.getBean("textEditorSetter");

    te.spellCheck();
  }
}
