//******************************************************************
//    Money.java
//    Author: Chris Montone
//    Programming Project 1b
//    5/31/2015
//    COP2551 Section 412566
//    This program prompts the user for numbers of coins and 
//    displays the value of the coins on the screen.
//******************************************************************
import java.util.Scanner;

public class Money
{
   //-------------------------------------------------------
   //    Inputs a user's information and prints 
   //    it out in certain structure.
   //-------------------------------------------------------
   public static void main (String[] args)
   {
      //Variable declarations for inputting the coin totals
      double quarters;
      double dimes;
      double nickels;
      double pennies;
      double totalValue;
      
      //Scanner object to input data into declared variables
      Scanner scan = new Scanner (System.in);

      //Inputs the number of Quaters
      System.out.println ("Please enter the number of quarters:");
      quarters = scan.nextInt();
      
      //Inputs the number of Dimes
      System.out.println ("Please enter the number of dimes:");
      dimes = scan.nextInt();
      
      //Inputs the number of Nickels
      System.out.println ("Please enter the number of nickels:");
      nickels = scan.nextInt();
      
      //Inputs the number of Quaters
      System.out.println ("Please enter the number of pennies:");
      pennies = scan.nextInt();
      
      //Calculates the total value of the change based on the total of each coin type.
      totalValue = (quarters/4) + (dimes/10) + (nickels/20) + (pennies/100);
      
      //Output the user's total value of change.
      System.out.println ("Congratulations! Your change is worth $"+totalValue);
   }
}

/*
  ----jGRASP exec: java Money
 Please enter the number of quarters:
 3
 Please enter the number of dimes:
 29
 Please enter the number of nickels:
 100
 Please enter the number of pennies:
 434
 Congratulations! Your change is worth $12.99
 
  ----jGRASP: operation complete.
  
*/