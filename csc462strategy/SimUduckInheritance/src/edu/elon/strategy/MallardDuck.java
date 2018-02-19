/*
 * MallardDuck.java version 1.0 Feb. 10, 2018
 *
 * Copyright (c) 2018 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.strategy;

public class MallardDuck extends Duck {

  public MallardDuck() {
    super();
  }

  @Override
  public String display() {
    String result = "I'm a real Mallard Duck";
    System.out.println(result);
    return result;
  }

}
