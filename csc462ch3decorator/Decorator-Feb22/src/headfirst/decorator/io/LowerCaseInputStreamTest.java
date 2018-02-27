package headfirst.decorator.io;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LowerCaseInputStreamTest {
  InputStream in;
  ByteArrayOutputStream out;
  String testString;

  @BeforeEach
  void setUp() throws Exception {
    testString = "This is a TEST";
    in = new LowerCaseInputStream(new ByteArrayInputStream(testString.getBytes()));
    out = new ByteArrayOutputStream();
  }

  @AfterEach
  void tearDown() throws Exception {
    in.close();
    out.close();
  }

  @Test
  void testRead1() {
    int c;
    
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
    byte[] buffer = new byte[testString.length()];
    
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
