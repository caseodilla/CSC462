package headfirst.strategy;

import java.util.ArrayList;
import java.util.Iterator;

public class ModelPreGenerics {

  @SuppressWarnings({ "unchecked", "rawtypes" })
  public static void main(String[] args) throws InstantiationException,
                                         IllegalAccessException,
                                         ClassNotFoundException {
    ArrayList aList = new ArrayList();
    aList.add(new MallardDuck());
    aList.add(new DecoyDuck());
    aList.add(Class.forName(System.getenv("duck")).newInstance());

    Iterator it = aList.iterator();
    while (it.hasNext()) {
      Duck d = (Duck) it.next();
      d.display();
    }

  }

}
