//    MobileHomeParks.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents a mobile home park building with one up to 25 units.
//******************************************************************

public class MobileHomeParks extends Residential
{
   //Constructor: Sets up this mobile home using the specified information
   //Mobile homes have a flat rate of $15 per unit.
   public MobileHomeParks (String cOwner, String cAddr, String cPropID,
                       String cPropMgr)
   {
      super (cOwner, cAddr, cPropID, cPropMgr, 15);
      
      unitCount = 1;
   }
   
   //Adds the specified number of units to this building's count of occupied units.
   //Doesn't allow more than 25 units.
   public void addUnits (int moreUnits)
   {
      if ((unitCount+moreUnits) <= 25) {
         unitCount += moreUnits;
      }
      else {
         System.out.println ("You can only have a max of 25 units");
      }
   }
   
   //Computes and returns the monthly for this residential building.
   public double monthlyFee()
   {
      double fee = rate * unitCount;
      
      return fee;
   }
   
   //Returns information about this residential building as a string
   public String toString()
   {
      String result = super.toString();
      
      return result;
   }
}