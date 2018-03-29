package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.LinkedList;

public class VesuvioMenu implements Menu {
  LinkedList<MenuItem> menuItems;
  
  public VesuvioMenu() {
    menuItems = new LinkedList<MenuItem>();
    addItem("Baked Ziti","Pasta mixed with ricotta cheese and tomato sauce, topped with mozzarella cheese and baked",true,10.50);
    addItem("Baked Spaghetti","Spaghetti baked with mozzarella cheese and meat sauce",false,10.50);
    addItem("Manicotti","Two large homemade manicotti smothered in tomato sauce and baked with cheese",true,10.25);
  }
  
  public void addItem(String name, String description, boolean vegetarian, double price) {
    MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    menuItems.add(menuItem);
  }
  
  public LinkedList<MenuItem> getMenuItems() {
    return menuItems;
  }
  
  public String toString() {
    return "Vesuvio's Menu";
  }

  public Iterator<MenuItem> createIterator() {
    return menuItems.iterator();
  }
}


