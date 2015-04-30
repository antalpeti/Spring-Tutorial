package com.tutorialspoint.annotationbasedconfiguration;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

  // without setter
  @Autowired
  private SpellChecker spellChecker;

  @Resource(name = "student2")
  private Student student;

  public TextEditor() {
    System.out.println("Inside TextEditor constructor.");
  }

  // with parametric constructor
  @Autowired
  public TextEditor(SpellChecker spellChecker) {
    System.out.println("Inside TextEditor parametric constructor.");
    this.spellChecker = spellChecker;
  }

  // with setter
  @Autowired
  public void setSpellChecker(SpellChecker spellChecker) {
    this.spellChecker = spellChecker;
  }

  public SpellChecker getSpellChecker() {
    return spellChecker;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public void spellCheck() {
    spellChecker.checkSpelling();
  }
}
