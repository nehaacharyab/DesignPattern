package com.design.patterns.structural.bridge;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class JavaQuestions implements Question {

  private final List<String> questions = new ArrayList<>();

  private int current = 0;

  public JavaQuestions() {
    questions.add("What is class? ");
    questions.add("What is interface? ");
    questions.add("What is abstraction? ");
    questions.add("How multiple polymorphism is achieved in java? ");
    questions.add("How many types of exception  handling are there in java? ");
    questions.add("Define the keyword final for  variable, method, and class in java? ");
    questions.add("What is abstract class? ");
    questions.add("What is multi-threading? ");
  }

  public void nextQuestion() {
    if (current <= questions.size() - 1) current++;
  }

  public void previousQuestion() {
    if (current > 0) current--;
  }

  public void newQuestion(String quest) {
    questions.add(quest);
  }

  public void deleteQuestion(String quest) {
    questions.remove(quest);
  }

  public void displayQuestion() {
    log.info(questions.get(current));
  }

  public void displayAllQuestions() {
    for (var quest : questions) {
      log.info(quest);
    }
  }
}
