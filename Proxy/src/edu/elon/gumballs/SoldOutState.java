package edu.elon.gumballs;

public class SoldOutState extends State {

  public SoldOutState(GumballMachine gumballMachine) {
    super(gumballMachine);
  }
  
  public String toString() {
    return "Machine is sold out.";
  }

}
