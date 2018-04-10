package edu.elon.accessories;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorServer {
  public static void main(String[] args) {
    try {
    Calculator calc = new CalculatorImpl();
    
    System.out.println("Binding server implementations to registry...");
    Context namingContext = new InitialContext();
    namingContext.rebind("rmi:calc", calc);
    System.out.println("Waiting for invocations from clients...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
