package edu.elon.gumballs;

import java.io.*;

public abstract interface State extends Serializable{
  public void insertQuarter();
  
  public void ejectQuarter();
  
  public void turnCrank();
  
  public void dispense();
  
  public String toString();
}