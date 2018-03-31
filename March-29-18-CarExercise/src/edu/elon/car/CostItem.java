package edu.elon.car;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Locale;

public class CostItem extends Component {
  private String name;
  private double cost;
  
  public CostItem(String name, double cost) {
    this.name = name;
    this.cost = cost;
  }
  
  public String getName() {
    return name;
  }
  
  public double getCost() {
    return cost;
  }
  
  public void print() {
    NumberFormat usd = NumberFormat.getCurrencyInstance(new Locale("en","US","USD"));
    System.out.printf("%-60s %10s\n",getName(),usd.format(getCost()));
  }

  @Override
  public Iterator<Component> iterator() {
    // TODO Auto-generated method stub
    return null;
  }
}
