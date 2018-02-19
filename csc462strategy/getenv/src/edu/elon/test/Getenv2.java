/**
 * Getenv2.java 1.0 Feb 12, 2018
 *
 * Copyright (c) 2018 Elon University
 * Elon, North Carolina, 27244 U.S.A.
 * All Rights Reserved
 */
package edu.elon.test;

/**
 * demo of how System.getenv works
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public class Getenv2 {

  /**
   * main application to demonstrate getting value of a well known
   * environment variable, PATH.
   * 
   * @param args String [] of command line parameters.
   */
  public static void main(String[] args) {
    String path = "";
    String splitCharacter = ":";

    try {
      path = System.getenv("PATH");
      System.out.println("PATH is:");
      String[] directories = path.split(splitCharacter);
      for (String directory : directories) {
        System.out.println("\t" + directory);
      }
    } catch (NullPointerException e) {
      System.out.println("Environmental Variable, PATH, not defined.");
      e.printStackTrace();
    }
    System.exit(0);
  }
}
