//    Residential.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents a residential building with one or more units
//******************************************************************

public class Residential extends Building
{
   protected int unitCount; //represents the number of occupied units
   
   //Constructor: Sets up this residential building using the specified information
   public Residential (String cOwner, String cAddr, String cPropID,
                       String cPropMgr, double rate)
   {
      super (cOwner, cAddr, cPropID, cPropMgr, rate);
      
      unitCount = 1;
   }
   
   //Adds the specified number of units to this building's
   //count of occupied units.
   public void addUnits (int moreUnits)
   {
      unitCount += moreUnits;
   }
   
   //Computes and returns the monthly for this residential building.
   //If there are more than 40 units it adds $10 for each unit over 40.
   public double monthlyFee()
   {
      double fee;
      if (unitCount <= 40) {
         fee = rate * unitCount;
      }
      else {
         fee = rate * unitCount;
         fee += (unitCount-40)*10;  
      }
      
      return fee;
   }
   
   //Returns information about this residential building as a string
   public String toString()
   {
      String result = super.toString();
      
      result += "\nCurrent number of occupied units: " + unitCount;
      
      return result;
   }
}