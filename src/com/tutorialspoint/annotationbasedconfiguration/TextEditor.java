package com.tutorialspoint.annotationbasedconfiguration;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

  // without setter
  @Autowired
  private SpellChecker spellChecker;

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

  public void spellCheck() {
    spellChecker.checkSpelling();
  }
}
