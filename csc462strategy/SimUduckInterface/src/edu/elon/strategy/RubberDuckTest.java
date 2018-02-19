package edu.elon.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class RubberDuckTest {
  private RubberDuck duck;

  @BeforeEach
  public void setUp() throws Exception {
    duck = new RubberDuck();

  }

  @AfterEach
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
    String actual = duck.fly();
    assertEquals(expected, actual);
  }

  @Test
  public void testQuack() {
    String expected = "Squeak, Squeak";
    String actual = duck.quack();
    assertEquals(expected, actual);
  }

  @Test
  public void testSwim() {
    String expected = "I can swim";
    String actual = duck.swim();
    assertEquals(expected, actual);
  }

}
