package headfirst.iterator.dinermergers;

public class MenuTestDrive {

  public static void main(String args[]) {
    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu dinerMenu = new DinerMenu();
    VesuvioMenu vesuvioMenu = new VesuvioMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, vesuvioMenu);
    waitress.printMenu();
  }

}
