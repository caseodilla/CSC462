package elon.edu.adapter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CompoundTest {
  Compound compound;
  ChemicalDataBank cdb;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
    compound = new Compound("water");
    cdb = new ChemicalDataBank();
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testGetMolecularFormula() {
    assertEquals(compound.getMolecularFormula(),cdb.getMolecularStructure("water"));
  }
  
  @Test
  void testGetMolecularWeight() {
    assertEquals(compound.getMolecularWeight(),cdb.getMolecularWeight("water"));
  }
  
  @Test
  void testGetMeltingPoint() {
    assertEquals(compound.getMeltingPoint(),cdb.getCriticalPoint("water", "M"));
  }
  
  @Test
  void testGetBoilingPoint() {
    assertEquals(compound.getBoilingPoint(),cdb.getCriticalPoint("water", "B"));
  }

}
