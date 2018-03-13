package headfirst.command.simpleremote;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LightTest {
  Light light;
  ByteArrayOutputStream baos;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {
  }

  @BeforeEach
  void setUp() throws Exception {
    light = new Light();
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @AfterEach
  void tearDown() throws Exception {
    System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
  }

  @Test
  void testLightOn() throws UnsupportedEncodingException {
    light.on();
    assertEquals(baos.toString(), "Light is on\r\n");
  }
  
  @Test
  void testLightOff() {
    light.off();
    assertEquals(baos.toString(), "Light is off\r\n");
  }
  
  @Test
  void testLightOnCommand() {
    LightOnCommand loc = new LightOnCommand(light);
    loc.execute();
    assertEquals(baos.toString(), "Light is on\r\n");
  }

}
