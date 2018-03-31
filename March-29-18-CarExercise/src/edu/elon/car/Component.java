package edu.elon.car;

public abstract class Component implements Iterable<Component> {
  
  public void add(Component component) {
    throw new UnsupportedOperationException();
  }
  
  public void remove(Component component) {
    throw new UnsupportedOperationException();
  }
  
  public void remove(String name) {
    throw new UnsupportedOperationException();
  }
  
  public Component getChild(int i) {
    throw new UnsupportedOperationException();
  }
  
  public String getName() {
    throw new UnsupportedOperationException();
  }
  
  public double getCost() {
    throw new UnsupportedOperationException();
  }
  
  public void print() {
    throw new UnsupportedOperationException();
  }
}
