package headfirst.iterator.dinermergeri;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {

  public static void main(String args[]) {
    List<Menu> menus = new ArrayList<Menu>();
    menus.add(new PancakeHouseMenu());
    menus.add(new DinerMenu());
    menus.add(new VesuvioMenu());
    Waitress waitress = new Waitress(menus);
    waitress.printMenu();
    waitress.printVegetarianMenu();

    System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
    System.out.print("Waitress says: ");
    if (waitress.isItemVegetarian("Hotdog")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    System.out.println("\nCustomer asks, are the Waffles vegetarian?");
    System.out.print("Waitress says: ");
    if (waitress.isItemVegetarian("Waffles")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
