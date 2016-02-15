//    Portfolio.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Represents the properties managed by property management company.
//******************************************************************

public class Portfolio
{
   private Property[] propertyList;
   
   //Constructor: Sets up the list of properties
   public Portfolio ()
   {
      propertyList = new Property[9];
      
      propertyList[0] = new Commercial ("Jabba The Hutt", "123 Main Line",
         "C-75", "Boba Fett", 2423.07);
      propertyList[1] = new Building ("Donald Trump", "1 Trump Tower",
         "B-221", "Omarosa", 1246.15);
      propertyList[2] = new Building ("Tony Stark", "789 Off Rocker",
         "B-59", "Pepper Potts", 1169.23);
      propertyList[3] = new Residential ("Nick Fury", "678 Fifth Ave",
         "R-154", "Phil Coulson", 20.55);
      propertyList[4] = new VacantLot ("Jack Bauer", "987 Suds Blvd",
         "Chole");
      propertyList[5] = new VacantLot ("Lone Ranger", "321 Duds Lane",
         "Tonto");
      propertyList[6] = new MobileHomeParks ("Barbara Lahey", "24 Loggerhead Lane",
         "M-123", "Jim Lahey");
      propertyList[7] = new MobileHomeParks ("Jane Anne", "489 Gumbo Court",
         "M-345", "Joe Bob");
      propertyList[8] = new Residential ("Homer Simpson", "742 Evergreen Terrace",
         "R-867", "Ned Flanders", 40);
         
      ((Commercial)propertyList[0]).assessPercentRent(5000.00);
      ((Residential)propertyList[3]).addUnits(20);
      ((MobileHomeParks)propertyList[6]).addUnits(15);
      ((MobileHomeParks)propertyList[7]).addUnits(20);
      ((Residential)propertyList[8]).addUnits(49);
   }
   
   //Calculates all management fees.
   public void assessFees ()
   {
      double amount;
      for (int count=0; count < propertyList.length; count++)
      {
         System.out.println (propertyList[count]);
         amount = propertyList[count].monthlyFee(); //polymorphic
         
         if (amount == 0.0)
            System.out.println ("Public service to the community!");
         else
            System.out.println ("Total Fees: " + amount);
         
         System.out.println ("-----------------------------------");
      }
   }
}