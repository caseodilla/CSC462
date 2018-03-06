package headfirst.factory.pizzasfs;

public class PizzaStore {

  public PizzaStore() {
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;
    SimplePizzaFactory factory = SimplePizzaFactory.getInstance();
    pizza = factory.createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
