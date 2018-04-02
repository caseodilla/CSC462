package edu.elon.gumballs;

public abstract class State {
  GumballMachine gumballMachine;
  
  public State(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }
  
  public void insertQuarter() {
    System.out.println("You can't insert a quarter now.");
  }
  
  public void ejectQuarter() {
    System.out.println("You can't eject the quarter right now.");
  }
  
  public void turnCrank() {
    System.out.println("You can't turn the crank right now.");
  }
  
  public void dispense() {
    System.out.println("Unable to dispense right now.");
  }
  
  public String toString() {
    return "Current state of Gumball Machine.";
  }
}