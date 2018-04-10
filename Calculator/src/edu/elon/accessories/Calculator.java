package edu.elon.accessories;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {

  Double operate(String op, Double storedNum, Double currentNum) throws RemoteException;

}
