package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {
  private Integer age;
  private String name;

  // @Required
  @Autowired(required = false)
  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }


  // @Required
  @Autowired(required = false)
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }
}
