package edu.elon.subway;

public class UnlockedState implements State {
  Subway sub;
  public UnlockedState(Subway sub) {
    this.sub = sub;
  }
  
  @Override
  public boolean coin() {
    System.out.println("The gate is already unlocked; no coin is needed");
    return false;
  }

  @Override
  public boolean pass() {
    System.out.println("Thank you for using the subway; please enjoy your ride!");
    sub.setState(sub.getLockedState());
    return true;
  }

}
