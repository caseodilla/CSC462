package edu.elon.gumballs;

public class SoldState extends State {
  public SoldState(GumballMachine gumballMachine) {
    super(gumballMachine);
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
}
