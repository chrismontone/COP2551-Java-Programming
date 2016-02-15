//    VacantLot.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents an property with no building. The firm manages two
//    vacant lot properties for the local municipality in exchange
//    for free advertising on the lot.
//******************************************************************

public class VacantLot extends Property
{
   //Constructor: Sets up this VacantLot using the specified information.
   public VacantLot (String cOwner, String cAddress, String cPropID)
   {
      super (cOwner, cAddress, cPropID);
   }
   
   //Returns a zero fee value for this VacantLot.
   public double monthlyFee ()
   {
      return 0.0;
   }
}