package com.tutorialspoint.dependencyinjection;

public class Foo {
  Bar bar;
  Baz baz;
  int year;
  String name;
  int weight;

  public Foo(Bar bar, Baz baz) {
    System.out.println("Inside Foo constructor with 2 parameters.");
    setBar(bar);
    setBaz(baz);
    System.out.println(getBar());
    System.out.println(getBaz());
  }

  public Foo(int year, String name, int weight) {
    System.out.println("Inside Foo constructor with 3 parameters.");
    setYear(year);
    setName(name);
    setWeight(weight);
    System.out.println("year: " + getYear());
    System.out.println("name: " + getName());
    System.out.println("weight: " + getWeight());
  }

  public Bar getBar() {
    return bar;
  }

  public void setBar(Bar bar) {
    this.bar = bar;
  }

  public Baz getBaz() {
    return baz;
  }

  public void setBaz(Baz baz) {
    this.baz = baz;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }
}
