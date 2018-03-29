package headfirst.iterator.dinermergeri;

public class MenuTestDrive {

  public static void main(String args[]) {
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
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
