package headfirst.strategy;

import java.util.ArrayList;
import java.util.Iterator;

public class ModelGenerics {

  public static void main(String[] args) throws InstantiationException,
                                         IllegalAccessException,
                                         ClassNotFoundException {
    ArrayList<Duck> aList = new ArrayList<Duck>();
    aList.add(new MallardDuck());
    aList.add(new DecoyDuck());
    aList.add((Duck) Class.forName(System.getenv("duck")).newInstance());

    Iterator<Duck> it = aList.iterator();
    while (it.hasNext()) {
      Duck d = it.next();
      d.display();
    }

  }

}
