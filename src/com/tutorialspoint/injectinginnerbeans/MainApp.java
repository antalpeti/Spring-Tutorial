package com.tutorialspoint.injectinginnerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("InjectingInnerBeansBeans.xml");

    TextEditor te = (TextEditor) context.getBean("textEditorProp");
    te = (TextEditor) context.getBean("textEditorConstr");

    te.spellCheck();
  }
}
