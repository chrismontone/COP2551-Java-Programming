//    Property.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents a generic piece of property
//******************************************************************

abstract public class Property implements MonthlyFee
{
   protected String owner;
   protected String address;
   protected String propertyID;
   
   //Constructor: Sets up this property using the specified information
   public Property (String cOwner, String cLocation, String cPropID)
   {
      owner = cOwner;
      address = cLocation;
      propertyID = cPropID;
   }
   
   //Returns a string including the basic property information
   public String toString()
   {
      String result = "Property Owner: " + owner + "\n";
      
      result += "Location: " + address + "\n";
      result += "Property ID: " + propertyID;
      
      return result;
   }
   
   //Derived classes must define the fee method for each type of property.
   public double monthlyFee() {
      return 0.0;
   }
}