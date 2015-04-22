package com.tutorialspoint.beanlifecycle;

public class DefaultBean {
  public void initDefault() {
    System.out.println("Default init call.");
  }

  public void destroyDefault() {
    System.out.println("Default destroy call.");
  }
}
