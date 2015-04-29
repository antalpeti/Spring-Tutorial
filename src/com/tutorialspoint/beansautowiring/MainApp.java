package com.tutorialspoint.beansautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("BeansAutoWiring.xml");

    TextEditor te = (TextEditor) context.getBean("textEditor");
    te.spellCheck();
    System.out.println(te.getName());

    TextEditor teByName = (TextEditor) context.getBean("textEditorByName");
    teByName.spellCheck();
    System.out.println(teByName.getName());

    TextEditor teByType = (TextEditor) context.getBean("textEditorByType");
    teByType.spellCheck();
    System.out.println(teByType.getName());
  }
}
