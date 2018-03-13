package elon.edu.adapter;

public class Compound implements ChemicalCompound {
  private ChemicalDataBank cdb;
  private String compound;
  
  public Compound(String compound) {
    this.compound = compound;
    cdb = new ChemicalDataBank();
  }

  @Override
  public String display() {
    String display = "Compound: " + compound + " ------\n";
    display += "Formula: " + getMolecularFormula() + "\n";
    display += "Weight: " + getMolecularWeight() + "\n";
    display += "Melting Pt: " + getMeltingPoint() + "\n";
    display += "BoilingPoint: " + getBoilingPoint() + "\n";
    System.out.println(display);
    return display;
  }

  @Override
  public double getBoilingPoint() {
    return cdb.getCriticalPoint(compound, "B");
  }

  @Override
  public double getMeltingPoint() {
    return cdb.getCriticalPoint(compound, "M");
  }

  @Override
  public String getMolecularFormula() {
    return cdb.getMolecularStructure(compound);
  }

  @Override
  public double getMolecularWeight() {
    return cdb.getMolecularWeight(compound);
  }

}
