package edu.elon.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RubberDuckTest {
  private RubberDuck duck;

  @Before
  public void setUp() throws Exception {
    duck = new RubberDuck();

  }

  @After
  public void tearDown() throws Exception {
    duck = null;
  }

  @Test
  public void testDisplay() {
    String expected = "I'm a Rubber Duck";
    String actual = duck.display();
    assertEquals(expected, actual);
  }

  @Test
  public void testFly() {
    String expected = "I can't fly";
    String actual = duck.performFly();
    assertEquals(expected, actual);
  }

  @Test
  public void testQuack() {
    String expected = "Squeak, Squeak";
    String actual = duck.performQuack();
    assertEquals(expected, actual);
  }

  @Test
  public void testSwim() {
    String expected = "I can swim";
    String actual = duck.swim();
    assertEquals(expected, actual);
  }

}
