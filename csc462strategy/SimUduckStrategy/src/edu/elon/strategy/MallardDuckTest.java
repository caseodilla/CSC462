package edu.elon.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MallardDuckTest {
  private MallardDuck duck;

  @BeforeEach
  public void setUp() throws Exception {
    duck = new MallardDuck();
  }

  @AfterEach
  public void tearDown() throws Exception {
    duck = null;
  }

  @Test
  public void testDisplay() {
    String expected = "I'm a real Mallard Duck";
    String actual = duck.display();
    assertEquals(expected, actual);
  }

  @Test
  public void testFly() {
    String expected = "I can fly";
    String actual = duck.performFly();
    assertEquals(expected, actual);
  }

  @Test
  public void testQuack() {
    String expected = "Quack, Quack";
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
