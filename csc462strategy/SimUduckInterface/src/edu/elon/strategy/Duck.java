/*
 * Duck.java version 1.0 Feb. 10, 2018
 *
 * Copyright (c) 2018 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public abstract class Duck {

  public Duck() {
    // intentionally empty
  }

  public abstract String display();

  public String swim() {
    String result = "I can swim";
    System.out.println(result);
    return result;
  }

}
