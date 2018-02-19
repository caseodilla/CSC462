/*
 * Duck.java version 1.0 Feb 11, 2018
 *
 * Copyright (c) 2018 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public abstract class Duck {

  private FlyBehavior flyBehavior;
  private QuackBehavior quackBehavior;

  public Duck() {
    // intentionally empty
  }

  public abstract String display();

  /**
   * @return the flyBehavior
   */
  public FlyBehavior getFlyBehavior() {
    return flyBehavior;
  }

  /**
   * @return the quackBehavior
   */
  public QuackBehavior getQuackBehavior() {
    return quackBehavior;
  }

  public String performFly() {
    return flyBehavior.fly();
  }

  public String performQuack() {
    return quackBehavior.quack();
  }

  /**
   * @param aFlyBehavior the flyBehavior to set
   */
  public void setFlyBehavior(FlyBehavior aFlyBehavior) {
    flyBehavior = aFlyBehavior;
  }

  /**
   * @param aQuackBehavior the quackBehavior to set
   */
  public void setQuackBehavior(QuackBehavior aQuackBehavior) {
    quackBehavior = aQuackBehavior;
  }

  public String swim() {
    String result = "I can swim";
    System.out.println(result);
    return result;
  }

}
