package edu.elon.gumballs;

public class SoldState implements State {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;
  
  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if(gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }
  
  @Override
  public String toString() {
    return "Machine is dispensing a gumball.";
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
}
