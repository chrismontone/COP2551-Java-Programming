//******************************************************************
//    Goals.java
//    Author: Chris Montone
//    Programming Project 1a
//    5/31/2015
//    COP2551 Section 412566
//    This program prompts the user for information 
//    and displays a message on the screen.
//******************************************************************
import java.util.Scanner;

public class Goals
{
   //-------------------------------------------------------
   //    Inputs a user's information and prints 
   //    it out in certain structure.
   //-------------------------------------------------------
   public static void main (String[] args)
   {
      //Variable declarations for the users' information
      String name;
      String age;
      String major;
      String dreamJob;
      
      //Scanner object to input data into declared variables
      Scanner scan = new Scanner (System.in);

      //Inputs the user's name
      System.out.println ("Please enter your name:");
      name = scan.nextLine();
      
      //Inputs the user's age
      System.out.println ("Please enter your age:");
      age = scan.nextLine();
      
      //Inputs the user's major
      System.out.println ("Please enter your major:");
      major = scan.nextLine();
      
      //Inputs the user's dream job
      System.out.println ("Please enter your dream job:");
      dreamJob = scan.nextLine();
      
      //Output the user's information in a structured format
      System.out.println ("Hello, my name is " + name + " and I am " + age);
      System.out.println ("years old. I am enjoying my time studying " + major +", and");
      System.out.println ("I want to be a " + dreamJob +" when I grow up!");
   }
}

/*
  ----jGRASP exec: java Goals
 Please enter your name:
 Steve
 Please enter your age:
 30
 Please enter your major:
 IT
 Please enter your dream job:
 Superman
 Hello, my name is Steve and I am 30
 years old. I am enjoying my time studying IT, and
 I want to be a Superman when I grow up!
 
  ----jGRASP: operation complete.
 
*/