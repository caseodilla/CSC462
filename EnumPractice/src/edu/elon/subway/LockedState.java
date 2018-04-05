package edu.elon.subway;

public class LockedState implements State {
  Subway sub;
  public LockedState(Subway sub) {
    this.sub = sub;
  }
  
  @Override
  public boolean coin() {
    System.out.println("You inserted a coin; the gate is unlocked!");
    sub.setState(sub.getUnlockedState());
    return true;
  }

  @Override
  public boolean pass() {
    System.out.println("Gate is locked; please insert a coin first.");
    return false;
  }

}
