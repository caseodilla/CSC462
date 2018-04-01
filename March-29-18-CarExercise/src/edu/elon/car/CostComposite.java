package edu.elon.car;

import java.util.ArrayList;
import java.util.Iterator;

public class CostComposite extends Component {
  private ArrayList<Component> components;
  private String name;
  
  public CostComposite(String name) {
    components = new ArrayList<Component>();
    this.name = name;
  }
  
  public void add(Component component) {
    components.add(component);
  }
  
  public boolean remove(Component component) {
    try{
      components.remove(component);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  
  public boolean remove(String name) {
    boolean status = false;
    for (int i=0; i<components.size(); i++) {
      Component child = getChild(i);
      try {
        if (child.getName().equals(name)) {
          status = remove(child);
        } else {
          status = child.remove(name);
        }
      } catch (UnsupportedOperationException e) {}
    }
    return status;
  }
  
  public Component getChild(int i) {    
    return components.get(i);
  }
  
  public String getName() {
    return name;
  }
  
  public double getCost() {
    double cost = 0;
    Iterator<Component> iter = components.iterator();
    while(iter.hasNext()) {
      Component component = iter.next();
      cost += component.getCost();
    }
    return cost;
  }
  
  public void print() {
    System.out.println(getName());
    Iterator<Component> iter = components.iterator();
    while(iter.hasNext()) {
      Component component = iter.next();
      component.print();
    }
  }
}
