package headfirst.decorator.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LowerCaseInputStreamTest {

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  void testRead1() {
    int c;
    String testString = "This is a TEST";
    InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(testString.getBytes()));
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    try {
      while((c = in.read()) > -1) {
        out.write(c);
      }
      assertTrue(out.toString().equals("this is a test"),"Failed to set lowercase.");
      assertFalse(out.toString().equals("This is a TEST"),"Failed to set lowercase.");
      
      in.close();
      out.close();
    } catch (IOException e) {
      fail("Threw IOException");
      e.printStackTrace();
    }
    
  }
  
  @Test
  void testRead2() {
    String testString = "This is a TEST";
    byte[] buffer = new byte[testString.length()];
    InputStream in = new LowerCaseInputStream(new ByteArrayInputStream(testString.getBytes()));
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    try {
      in.read(buffer, 0, testString.length());
      out.write(buffer);
      
      assertTrue(out.toString().equals("this is a test"),"Failed to set lowercase.");
      assertFalse(out.toString().equals("This is a TEST"),"Failed to set lowercase.");
      
      in.close();
      out.close();
    } catch (IOException e) {
      fail("Threw IOException");
      e.printStackTrace();
    }
  }

}
