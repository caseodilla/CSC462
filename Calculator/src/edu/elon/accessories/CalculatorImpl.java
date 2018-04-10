package edu.elon.accessories;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
  
  private static final long serialVersionUID = 1L;

  public CalculatorImpl() throws RemoteException {
    
  }
  
  @Override
  public Double operate(String op, Double storedNum, Double currentNum) throws RemoteException {
    System.out.println("Performing operation: " + storedNum + " " + op + " " + currentNum);
    switch (op) {
    case "+":
      return storedNum + currentNum;
    case "-":
      return storedNum - currentNum;
    case "*":
      return storedNum * currentNum;
    case "/":
      return storedNum / currentNum;
    }
    return currentNum;
  }

}
