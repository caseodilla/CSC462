package edu.elon.strategy;

public class Quack implements QuackBehavior {

  public String quack() {
    String result = "Quack, Quack";
    System.out.println(result);
    return result;
  }

}
