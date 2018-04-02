package edu.elon.gumballs;

public class GumballMachine {

  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;
  
  State state;
  int count = 0;
  String location;
  
  public GumballMachine(String location, int numberGumballs) {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    
    this.location = location;
    this.count = numberGumballs;
    if(numberGumballs > 0) {
      state = noQuarterState;
    } else {
      state = soldOutState;
    }
  }
  
  public void insertQuarter() {
    state.insertQuarter();
  }
  
  public void ejectQuarter() {
    state.ejectQuarter();
  }
  
  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }
  
  void setState(State state) {
    this.state = state;
  }
  
  public State getState() {
    return state;
  }
  
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count = count-1; 
    }
  }
  
  public String getLocation() {
    return location;
  }
  
  public int getCount() {
    return count;
  }
  
  public State getSoldOutState() {
    return soldOutState;
  }
  
  public State getNoQuarterState() {
    return noQuarterState;
  }
  
  public State getHasQuarterState() {
    return hasQuarterState;
  }
  
  public State getSoldState() {
    return soldState;
  }
  
  public State getWinnerState() {
    return winnerState;
  }
  
  public String toString() {
    String status = "\nMighty Gumball, Inc.\n";
    status += "Java-enabled Standing Gumball Model #2004\n";
    status += "Inventory: " + getCount() + " gumballs\n";
    status += state + "\n";
    return status;
  }
}
