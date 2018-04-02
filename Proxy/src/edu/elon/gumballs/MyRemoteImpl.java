package edu.elon.gumballs;

import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
  
  private static final long serialVersionUID = 1L;
  
  public String sayHello() {
    return "Server says, 'Hey'";
  }
  
  public MyRemoteImpl() throws RemoteException {}
  
  public static void main(String[] args) {
    try {
      MyRemote service = new MyRemoteImpl();
      Naming.rebind("RemoteHello", service);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
