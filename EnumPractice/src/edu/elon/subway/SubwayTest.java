package edu.elon.subway;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubwayTest {
  Subway sub;

  @BeforeEach
  void setUp() throws Exception {
    sub = new Subway();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testCoin1() {
    System.out.println("TestCoin1");
    assertTrue(sub.coin());
  }
  
  @Test
  void testCoin2() {
    System.out.println("TestCoin2");
    sub.coin();
    assertFalse(sub.coin());
  }

  @Test
  void testPass1() {
    System.out.println("TestPass1");
    sub.coin();
    assertTrue(sub.pass());
  }
  
  @Test
  void testPass2() {
    System.out.println("TestPass2");
    assertFalse(sub.pass());
  }

}
