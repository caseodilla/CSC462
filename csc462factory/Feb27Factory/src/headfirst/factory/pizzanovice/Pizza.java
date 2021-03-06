package headfirst.factory.pizzanovice;

import java.util.ArrayList;

abstract public class Pizza {
  String dough;
  String name;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();

  public void bake() {
    System.out.println("Baking " + name);
  }

  public void box() {
    System.out.println("Boxing " + name);
  }

  public void cut() {
    System.out.println("Cutting " + name);
  }

  public String getName() {
    return name;
  }

  public void prepare() {
    System.out.println("Preparing " + name);
  }

  @Override
  public String toString() {
    // code to display pizza name and ingredients
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append((String) toppings.get(i) + "\n");
    }
    return display.toString();
  }
}
