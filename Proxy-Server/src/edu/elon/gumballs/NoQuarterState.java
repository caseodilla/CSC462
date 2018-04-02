package edu.elon.gumballs;

public class NoQuarterState implements State {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  @Override
  public String toString() {
    return "Machine is waiting for a quarter.";
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
