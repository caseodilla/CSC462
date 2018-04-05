/**
   @version 1.00 
   @author Cay Horstmann
 */
package edu.elon.product;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the implementation class for the remote product objects.
 */
public class ProductImpl extends UnicastRemoteObject implements Product {
  private String name;

  /**
   * Constructs a product implementation
   * 
   * @param n the product name
   */
  public ProductImpl(String n) throws RemoteException {
    name = n;
  }

  public String getDescription() throws RemoteException {
    return "I am a " + name + ". Buy me!";
  }
}
