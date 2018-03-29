package headfirst.iterator.dinermergeri;

import java.util.Iterator;

public class Waitress {
  private Menu dinerMenu;
  private Menu pancakeHouseMenu;
  private Menu vesuvioMenu;

  public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu vesuvioMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.vesuvioMenu = vesuvioMenu;
  }

  public boolean isItemVegetarian(String name) {
    Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
    if (isVegetarian(name, pancakeIterator)) {
      return true;
    }
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    if (isVegetarian(name, dinerIterator)) {
      return true;
    }
    Iterator<MenuItem> vesuvioIterator = vesuvioMenu.createIterator();
    if (isVegetarian(name, vesuvioIterator)) {
      return true;
    }
    return false;
  }

  public void printMenu() {
    Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
    Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    Iterator<MenuItem> vesuvioIterator = vesuvioMenu.createIterator();

    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(pancakeIterator);
    System.out.println("\nLUNCH");
    printMenu(dinerIterator);
    System.out.println("\nDINNER");
    printMenu(vesuvioIterator);
  }

  public void printVegetarianMenu() {
    System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
    printVegetarianMenu(pancakeHouseMenu.createIterator());
    System.out.println("\nLUNCH");
    printVegetarianMenu(dinerMenu.createIterator());
    System.out.println("\nDINNER");
    printVegetarianMenu(vesuvioMenu.createIterator());
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
