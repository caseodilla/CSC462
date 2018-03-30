package headfirst.iterator.dinermergeri;

import java.util.Iterator;
import java.util.List;

public class Waitress {
  private List<Menu> menus;

  public Waitress(List<Menu> menus) {
    this.menus = menus;
  }

  public boolean isItemVegetarian(String name) {
    for (Menu m : menus) {
      Iterator<MenuItem> iter = m.createIterator();
      if (isVegetarian(name, iter)) {
        return true;
      }
    }
    return false;
  }

  public void printMenu() {
    System.out.println("MENU\n----");
    for (Menu m : menus) {
      System.out.println(m.getMealType());
      Iterator<MenuItem> iter = m.createIterator();
      printMenu(iter);
      System.out.print("\n");
    }
  }

  public void printVegetarianMenu() {
    System.out.println("\nVEGETARIAN MENU\n----");
    for (Menu m : menus) {
      System.out.println(m.getMealType());
      Iterator<MenuItem> iter = m.createIterator();
      printVegetarianMenu(iter);
      System.out.print("\n");
    }
  }

  private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.getName().equals(name)) {
        if (menuItem.isVegetarian()) {
          return true;
        }
      }
    }
    return false;
  }

  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }

  private void printVegetarianMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      if (menuItem.isVegetarian()) {
        System.out.print(menuItem.getName());
        System.out.println("\t\t" + menuItem.getPrice());
        System.out.println("\t" + menuItem.getDescription());
      }
    }
  }
}
