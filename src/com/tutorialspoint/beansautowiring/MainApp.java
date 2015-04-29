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

    TextEditor teConstr = (TextEditor) context.getBean("textEditorConstr");
    teConstr.spellCheck();
    System.out.println(teConstr.getName());

    TextEditor teConstructor = (TextEditor) context.getBean("textEditorConstructor");
    teConstructor.spellCheck();
    System.out.println(teConstructor.getName());
  }
}
