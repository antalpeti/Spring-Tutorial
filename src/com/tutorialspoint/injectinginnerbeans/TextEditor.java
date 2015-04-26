package com.tutorialspoint.injectinginnerbeans;

import com.tutorialspoint.dependencyinjection.SpellChecker;

public class TextEditor {
  private SpellChecker spellChecker;

  public TextEditor() {}

  public TextEditor(SpellChecker spellchecker) {
    System.out.println("Inside TextEditor constructor.");
    this.spellChecker = spellchecker;
  }

  // a setter method to inject the dependency.
  public void setSpellChecker(SpellChecker spellChecker) {
    System.out.println("Inside setSpellChecker.");
    this.spellChecker = spellChecker;
  }

  // a getter method to return spellChecker
  public SpellChecker getSpellChecker() {
    return spellChecker;
  }

  public void spellCheck() {
    spellChecker.checkSpelling();
  }
}
