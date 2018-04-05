package edu.elon.subway;

public class Subway {
  public State state;
  public State locked;
  public State unlocked;
  
  public Subway() {
    locked = new LockedState(this);
    unlocked = new UnlockedState(this);
    
    state = locked;
  }

  public State getState() {
    return state;
  }
  
  public void setState(State state) {
    this.state = state;
  }
  
  public boolean coin() {
    return state.coin();
  }
  
  public boolean pass() {
    return state.pass();
  }
  
  public State getLockedState() {
    return locked;
  }
  
  public State getUnlockedState() {
    return unlocked;
  }

}
