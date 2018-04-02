package edu.elon.gumballs;

public class NoQuarterState extends State {

  public NoQuarterState(GumballMachine gumballMachine) {
    super(gumballMachine);
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
}
