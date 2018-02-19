package edu.elon.strategy;

public class FlyNoWay implements FlyBehavior {

  public String fly() {
    String result = "I can't fly";
    System.out.println(result);
    return result;
  }

}
