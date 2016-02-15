//******************************************************************
//    Goals.java
//    Author: Chris Montone
//    Programming Project 2a
//    6/14/2015
//    COP2551 Section 412566
//    This program inputs the users name and generates
//    a unique username.
//******************************************************************
import java.util.Scanner;
import java.util.Random;

public class Username
{
   public static void main (String[] args)
   {
      //New random number generater object
      Random generator = new Random();
      
      //Variable declarations to store first name, last name, and username
      String fname;
      String lname;
      String username;
      
      //Generates and stores a random number between 10 and 99
      int number = generator.nextInt(90)+10;
      
      //Scanner object to user data
      Scanner scan = new Scanner (System.in);

      //Inputs the user's name
      System.out.println ("Please enter your first name:");
      fname = scan.nextLine();
      
      //Inputs the user's age
      System.out.println ("Please enter your last name:");
      lname = scan.nextLine();
      
      //Concatnetes the first 4 letters of the last name with the
      //first 2 letters of the first name with a random number between 10-99
      username = lname.substring(0,4) + fname.substring(0,2) + number;
      
      //Output the user's information in a structured format
      System.out.println ("Your user name is: " + username);
   }
}

/*
  ----jGRASP exec: java Username
 Please enter your first name:
 joe
 Please enter your last name:
 smith
 Your user name is: smitjo78
 
  ----jGRASP: operation complete.
  */  