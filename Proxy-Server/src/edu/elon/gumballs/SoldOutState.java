package edu.elon.gumballs;

public class SoldOutState implements State {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public String toString() {
    return "Machine is sold out.";
  }

  @Override
  public void insertQuarter() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void ejectQuarter() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void turnCrank() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void dispense() {
    // TODO Auto-generated method stub
    
  }

}
