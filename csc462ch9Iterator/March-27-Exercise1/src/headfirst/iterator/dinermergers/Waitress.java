package headfirst.iterator.dinermergers;

import java.util.ArrayList;
import java.util.LinkedList;

public class Waitress {

  private PancakeHouseMenu pancakeHouseMenu;
  private DinerMenu dinerMenu;
  private VesuvioMenu vesuvioMenu;

  public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu, VesuvioMenu vesuvioMenu) {
    this.pancakeHouseMenu = pancakeHouseMenu;
    this.dinerMenu = dinerMenu;
    this.vesuvioMenu = vesuvioMenu;
  }

  public void printMenu() {
    ArrayList<MenuItem> menuItemsPancakeHouse = pancakeHouseMenu.getMenuItems();
    MenuItem[] menuItemsDiner = dinerMenu.getMenuItems();
    LinkedList<MenuItem> menuItemsVesuvio = vesuvioMenu.getMenuItems();

    System.out.println("MENU\n----\nBREAKFAST");
    for (int i = 0; i < menuItemsPancakeHouse.size(); i++) {
      MenuItem menuItem = menuItemsPancakeHouse.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nLUNCH");
    for (int i = 0; i < menuItemsDiner.length-1; i++) {
      MenuItem menuItem = menuItemsDiner[i];
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
    System.out.println("\nDINNER");
    for (int i = 0; i < menuItemsVesuvio.size(); i++) {
      MenuItem menuItem = menuItemsVesuvio.get(i);
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
      
    }
  }

}
