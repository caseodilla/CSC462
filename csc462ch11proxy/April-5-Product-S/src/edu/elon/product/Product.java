/**
 * Product.java 1.0 April 5, 2018
 *
 * Copyright (c) 2018 David J. Powell. All Rights Reserved
 */
package edu.elon.product;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Product supports only one method to describe it
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public interface Product extends Remote {

  String getDescription() throws RemoteException;

}
