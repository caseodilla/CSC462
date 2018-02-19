package edu.elon.strategy;

public class FlyWithWings implements FlyBehavior {

  public String fly() {
    String result = "I can fly";
    System.out.println(result);
    return result;
  }

}
