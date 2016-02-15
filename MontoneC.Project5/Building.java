//    Building.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents a generic building under management.
//******************************************************************

public class Building extends Property
{
   protected String propertyManager;
   protected double rate;
   
   //Contructor: Sets up this building with the specified information.
   public Building (String cOwner, String cAddr, String cPropID,
                    String cPropMgr, double rate)
   {
      super (cOwner, cAddr, cPropID);
      
      propertyManager = cPropMgr;
      this.rate = rate;
   }
   
   //Returns information about a building as a string.
   public String toString()
   {
      String result = super.toString();
      
      result += "\nProperty Manager: " +  propertyManager;
      
      return result;
   }
   
   //Returns the management fee for this building.
   public double monthlyFee()
   {
      return rate;
   }
}