package edu.elon.gumballs;

public class WinnerState implements State {
  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() == 0) {
      gumballMachine.setState(gumballMachine.getSoldOutState());
    } else {
      gumballMachine.releaseBall();
      System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter!");
      if (gumballMachine.getCount() > 0) {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs.");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
  }
  
  public String toString() {
    return "Machine is celebrating a winner.";
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
