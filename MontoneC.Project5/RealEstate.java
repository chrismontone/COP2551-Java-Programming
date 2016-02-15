//    RealEstate.java
//    Author: Chris Montone
//    Programming Project 5
//    8/20/2015
//    COP2551 Section 412566
//    Demostrates polymorphism via inheritance and interface.
//******************************************************************

public class RealEstate
{

   //Creates an inventory of properties managed and assesses fees.
   public static void main (String[] args)
   {
      Portfolio properties = new Portfolio();
      
      properties.assessFees();
   }
}

/*

  ----jGRASP exec: java RealEstate
 Property Owner: Jabba The Hutt
 Location: 123 Main Line
 Property ID: C-75
 Property Manager: Boba Fett
 Monthly Percentage Rent Fee: 137.5
 Total Fees: 2560.57
 -----------------------------------
 Property Owner: Donald Trump
 Location: 1 Trump Tower
 Property ID: B-221
 Property Manager: Omarosa
 Total Fees: 1246.15
 -----------------------------------
 Property Owner: Tony Stark
 Location: 789 Off Rocker
 Property ID: B-59
 Property Manager: Pepper Potts
 Total Fees: 1169.23
 -----------------------------------
 Property Owner: Nick Fury
 Location: 678 Fifth Ave
 Property ID: R-154
 Property Manager: Phil Coulson
 Current number of occupied units: 21
 Total Fees: 431.55
 -----------------------------------
 Property Owner: Jack Bauer
 Location: 987 Suds Blvd
 Property ID: Chole
 Public service to the community!
 -----------------------------------
 Property Owner: Lone Ranger
 Location: 321 Duds Lane
 Property ID: Tonto
 Public service to the community!
 -----------------------------------
 Property Owner: Barbara Lahey
 Location: 24 Loggerhead Lane
 Property ID: M-123
 Property Manager: Jim Lahey
 Current number of occupied units: 16
 Total Fees: 240.0
 -----------------------------------
 Property Owner: Jane Anne
 Location: 489 Gumbo Court
 Property ID: M-345
 Property Manager: Joe Bob
 Current number of occupied units: 21
 Total Fees: 315.0
 -----------------------------------
 Property Owner: Homer Simpson
 Location: 742 Evergreen Terrace
 Property ID: R-867
 Property Manager: Ned Flanders
 Current number of occupied units: 50
 Total Fees: 2100.0
 -----------------------------------
 
  ----jGRASP: operation complete.
 

*/