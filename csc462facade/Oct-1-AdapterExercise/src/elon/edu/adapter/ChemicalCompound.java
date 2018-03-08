/**
 * ChemicalCompound.java 1.0 Sep 27, 2015
 * 
 * Copyright (c) 2015 Elon University Elon, North Carolina, 27244
 * U.S.A. All Rights Reserved
 */
package elon.edu.adapter;

/**
 * Interface that client demands implentation to support
 * 
 * @author dpowell2
 * @version 1.0
 * 
 */
public interface ChemicalCompound {

  /**
   * 
   * Writes chemical information of boiling point, melting point,
   * molecular weight and molecular structure to standard out and also
   * returns it as a string.
   * 
   * @return String representation of chemical properties
   */
    String display();

  /**
   * Gets Boiling Point of Chemical
   * 
   * @return double value of Chemical Boiling Point
   */
    double getBoilingPoint();

  /**
   * Gets Melting Point of Chemical
   * 
   * @return double value of Chemical Melting Point
   */
    double getMeltingPoint();

  /**
   * Gets Molecular Structure of Chemical
   * 
   * @return String representing Chemical Formula
   */
    String getMolecularFormula();

  /**
   * Gets Molecular Weight of Chemical
   * 
   * @return double value of Chemical Molecular Weight
   */
    double getMolecularWeight();
}
