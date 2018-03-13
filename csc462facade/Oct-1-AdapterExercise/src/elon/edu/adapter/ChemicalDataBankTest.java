package elon.edu.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChemicalDataBankTest {
  ChemicalDataBank cdb;  

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
    cdb = new ChemicalDataBank();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testGetCriticalPoint() {
    assertEquals(0.0f,cdb.getCriticalPoint("water", "M"));
    assertEquals(5.5f,cdb.getCriticalPoint("benzene", "M"));
    assertEquals(-114.1f,cdb.getCriticalPoint("alcohol", "M"));
    assertEquals(100.0f,cdb.getCriticalPoint("water", "B"));
    assertEquals(80.1f,cdb.getCriticalPoint("benzene", "B"));
    assertEquals(78.3f,cdb.getCriticalPoint("alcohol", "B"));
  }
  
  @Test
  void testGetMolecularStructure() {
    assertEquals("H2O",cdb.getMolecularStructure("water"));
    assertNotEquals("H20",cdb.getMolecularStructure("water"));
  }
  
  @Test
  void testGetMolecularWeight() {
    assertEquals(18.015,cdb.getMolecularWeight("water"));
    assertNotEquals(18,cdb.getMolecularWeight("water"));
  }

}
