//******************************************************************
//    Goals.java
//    Author: Chris Montone
//    Programming Project 2b
//    6/14/2015
//    COP2551 Section 412566
//    This program generates a random identification number
//******************************************************************
import java.util.Scanner;
import java.util.Random;

public class idNumber
{
   public static void main (String[] args)
   {
      //New random number generater object
      Random generator = new Random();
      
      //Variable declarations to generate each digit
      int num1, num2, num3, num45, num6789;
      
      //Variable to store random Id Number
      String idNumber;
      
      //Generates random numbers between 0 and 7 for the first 3 digits
      num1 = generator.nextInt(8);
      num2 = generator.nextInt(8);
      num3 = generator.nextInt(8);
      
      //Generates a random number between 10 and 73 for the 4th and 5th digits
      num45 = generator.nextInt(64)+10;
      
      //Generates a random number between 1000 and 9999 for the 6th through 9th digits
      num6789 = generator.nextInt(9000)+1000;
      
      //Concatenates the generated numbers in the form of XXX-XX-XXXX
      idNumber = num1+""+num2+""+num3+"-"+num45+"-"+num6789;
      
      //Output the user's idNumber
      System.out.println ("Your idNumber is: " + idNumber);
   }
}

/*

 ----jGRASP exec: java idNumber
 Your idNumber is: 345-49-2636
 
  ----jGRASP: operation complete.


*/