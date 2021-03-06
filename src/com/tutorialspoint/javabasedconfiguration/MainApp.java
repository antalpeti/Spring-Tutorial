package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

    HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

    helloWorld.setMessage("Hello World!");
    helloWorld.getMessage();

    ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

    TextEditor te = ctx.getBean(TextEditor.class);

    te.spellCheck();

    ctx = new AnnotationConfigApplicationContext(ConfigB.class);
    // now both beans A and B will be available...
    A a = ctx.getBean(A.class);
    B b = ctx.getBean(B.class);

    ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    Foo foo1 = ctx.getBean(Foo.class);
    Foo foo2 = ctx.getBean(Foo.class);
    System.out.println("foo1 == foo2 : " + (foo1 == foo2));
    System.out.println(foo1);
    System.out.println(foo2);
  }
}
