package edu.elon.gumballs;

import java.rmi.*;

public class GumballMonitorTestDrive {

  public static void main(String[] args) {
    /*
    String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                         "rmi://boulder.mightygumball.com/gumballmachine",
                         "rmi://seattle.mightygumball.com/gumballmachine"};
    */
    String[] location = {"rmi://localhost/gumballmachine"};
    GumballMonitor[] monitor = new GumballMonitor[location.length];
    
    for (int i=0; i<location.length; i++) {
      try {
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitor[i] = new GumballMonitor(machine);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    
    for (int i=0; i<monitor.length; i++) {
      monitor[i].report();
    }
    
  }

}
