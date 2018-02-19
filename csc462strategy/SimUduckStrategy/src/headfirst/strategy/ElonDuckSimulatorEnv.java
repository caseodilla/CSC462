package headfirst.strategy;

/**
 * Demonstrate use of reflection to automatically load a class based
 * on the class String name obtained from the environment variable
 * duck and then dynamically create an instance of it using
 * newInstance
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class ElonDuckSimulatorEnv {

  public static void main(String[] args) {

    try {
      String aDuck = System.getenv("duck");
      Duck elonDuck = (Duck) Class.forName(aDuck).newInstance();

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
