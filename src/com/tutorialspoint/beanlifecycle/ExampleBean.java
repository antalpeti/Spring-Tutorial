package com.tutorialspoint.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleBean implements InitializingBean, DisposableBean {

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("Initialization with help of InitializingBean interface.");
  }

  @Override
  public void destroy() throws Exception {
    System.out.println("Destruction with help of DisposableBean interface.");
  }

  public void initByXML() {
    System.out.println("Initialization with help of Bean Configuration file.");
  }

  public void destroyByXML() {
    System.out.println("Destruction with help of Bean Configuration file.");
  }
}
