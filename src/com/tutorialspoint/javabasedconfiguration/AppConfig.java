package com.tutorialspoint.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
  @Bean(initMethod = "init", destroyMethod = "cleanup")
  public Foo foo() {
    return new Foo();
  }
}
