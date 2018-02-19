package headfirst.strategy;

public class ElonDuck extends Duck {

  public ElonDuck() {
    super();
    flyBehavior = new FlyRocketPowered();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("I'm a Elon Phoenix duck");
  }
}
