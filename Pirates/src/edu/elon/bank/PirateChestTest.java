/**
 * 
 */
package edu.elon.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * @author chayes10
 *
 */
class PirateChestTest {
	private PirateChest chest;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Setting up chest");
		chest = new PirateChest(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Cleaning up chest");
		chest = null;
	}
	
	@Test
	void testAddGold() {
		System.out.println("testAddGold");
		chest.addGold(20);
		int actual = chest.checkGold();
		int expected = 30;
		Assertions.assertEquals(actual,expected,"Should be 30 pieces in chest");
	}
	
	@Test
	void testRemoveGold() {
		System.out.println("testRemoveGold");
		chest.removeGold(3);
		int actual = chest.checkGold();
		int expected = 7;
		Assertions.assertEquals(actual,expected,"Should be 7 pieces in chest");
	}
	
	@Test
	void testCheckGold() {
		System.out.println("testCheckGold");
		int actual = chest.checkGold();
		int expected = 10;
		Assertions.assertEquals(actual,expected,"Should be 10 pieces in chest");
	}
	
	@Test
	void testToString() {
		System.out.println("testToString");
		String actual = chest.toString();
		String expected = "Chest has 10 pieces of gold";
		Assertions.assertEquals(actual, expected,"Should be 'Chest has 10 pieces of gold'");
	}
	
	@Test
	void testEquals() {
		System.out.println("testToString");
		PirateChest chest1 = new PirateChest(10);
		PirateChest chest2 = new PirateChest(11);
		
		Assertions.assertTrue(chest.equals(chest1),"Should be TRUE");
		Assertions.assertFalse(chest.equals(chest2),"Should be FALSE");
	}
	
	@Test
	void testAddGoldNegativeAmount() {
		System.out.println("testAddGoldNegativeAmount");
		try {
			chest.addGold(-5);
			fail("Expected an Illegal Argument Exception to be thrown");
		} catch(IllegalArgumentException e) {
			assertEquals("Must be a number greater than 0", e.getMessage());
		}
	}

	@Test
	@Disabled
	void test() {
		//fail("Not yet implemented");
	}

}
