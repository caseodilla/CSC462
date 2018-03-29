package headfirst.iterator.dinermergeri;

public class MenuItem {
  private String description;

  private String name;

  private double price;

  private boolean vegetarian;

  public MenuItem(String name, String description, boolean vegetarian, double price) {
    this.name = name;
    this.description = description;
    this.vegetarian = vegetarian;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }
}
