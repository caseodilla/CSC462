package headfirst.strategy;

/**
 * Demonstrate use of reflection to automatically load a class based
 * on the class String name and then dynamically create an instance of
 * it using newInstance
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class ElonDuckSimulator1 {

  public static void main(String[] args) {

    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();

    try {
      Duck elonDuck =
        (Duck) Class.forName("headfirst.strategy.ElonDuck").newInstance();
      elonDuck.display();
      elonDuck.performFly();
      elonDuck.performQuack();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

  }
}
