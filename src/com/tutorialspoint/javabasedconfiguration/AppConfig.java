package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
  @Bean(initMethod = "init", destroyMethod = "cleanup")
  @Scope(value = "prototype")
  public Foo foo() {
    return new Foo();
  }
}
