package edu.elon.car;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;

public class CarBuyer {
  Component allComponents;

  private static NumberFormat usd = NumberFormat.getCurrencyInstance(new Locale("en","US","USD"));
  
  public CarBuyer(Component allComponents) {
    this.allComponents = allComponents;
  }
  
  public double getCost() {
    return allComponents.getCost();
  }
  
  public void print() {
    double cost = allComponents.getCost();
    System.out.println("Summary");
    allComponents.print();
    System.out.printf("%71s","Total MSRP as built " + usd.format(cost));
  }
}
