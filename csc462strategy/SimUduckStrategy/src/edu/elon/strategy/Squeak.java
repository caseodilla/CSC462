package edu.elon.strategy;

public class Squeak implements QuackBehavior {

  public String quack() {
    String result = "Squeak, Squeak";
    System.out.println(result);
    return result;
  }

}
