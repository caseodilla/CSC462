package edu.elon.car;

public class CarTestDriver {

  public static void main(String[] args) {
    
    Component model = new CostComposite("Model");
    model.add(new CostItem("Camry Hybrid SE", 29500));

    Component color = new CostComposite("Color");
    color.add(new CostItem("Exterior: Ruby Flare Pearl",0));
    color.add(new CostItem("Interior: Black SofTex",0));

    Component pkg = new CostComposite("Package");
    Component accessories = new CostComposite("Accessories");
    accessories.add(new CostItem("Blind Spot Monitor",600));
    accessories.add(new CostItem("Carpet Mats",299));
    pkg.add(accessories);    
    pkg.add(new CostItem("Destination, Process, and Handling Fee",895));

    model.add(color);
    model.add(pkg);
    
    CarBuyer carBuyer = new CarBuyer(model);
    carBuyer.print();
    
    System.out.println("\n\n");
    String removeItem = "Carpet Mats";
    System.out.println(carBuyer.remove(removeItem) ? "Successfully removed " + removeItem : "Could not find " + removeItem);
    System.out.print("\n");
    carBuyer.print();
  }
  
}
