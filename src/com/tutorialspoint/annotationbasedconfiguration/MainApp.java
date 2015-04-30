package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("AnnotationBasedConfigurationBeans.xml");

    Student student = (Student) context.getBean("student");

    System.out.println("Name : " + student.getName());
    System.out.println("Age : " + student.getAge());

    TextEditor te = (TextEditor) context.getBean("textEditor");

    te.spellCheck();

    Profile profile = (Profile) context.getBean("profile");

    profile.printAge();
    profile.printName();
  }
}
