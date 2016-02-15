//******************************************************************
//    StudentBody.java
//    Author: Chris Montone
//    Programming Project 4
//    7/31/2015
//    COP2551 Section 412566
//    A main program that uses the Address and Student classes to
//    create a student body of 4 students.
//******************************************************************

public class StudentBody 
{
   //-----------------------------------------------------------------
   //  Creates some Address and Student objects and prints them.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //Declerations of addresses and students in the student body
      Address school = new Address ("800 Lancaster Ave.", "Villanova","PA", 19085);
      
      Address jHome = new Address ("21 Jump Street", "Lynchburg","VA", 24551);
      
      Student john = new Student ("John", "Smith", jHome, school);

      Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
      
      Student marsha = new Student ("Marsha", "Jones", mHome, school);
      
      Address cHome = new Address ("321 Anywhere Rd", "Los Angeles", "CA", 90210);
      
      Student chris = new Student ("Chris", "Montone", cHome, school, 100, 95, 98);
      
      Address sHome = new Address ("221b Baker Street", "London", "EG", 12345);
      
      Student steve = new Student ("Steve", "Smith", sHome, school, 80, 60, 75);

      //Print out the information of all 4 of the current students
      System.out.println (john);
      System.out.println ();
      System.out.println (marsha);
      System.out.println ();
      System.out.println (chris);
      System.out.println ();
      System.out.println (steve);
      
      //Updates the 3 test scores of John
      john.setTestScores(1, 40);
      john.setTestScores(2, 65);
      john.setTestScores(3, 78);
      
      //Updates the 3 test scores of Marsha
      marsha.setTestScores(1, 88);
      marsha.setTestScores(2, 93);
      marsha.setTestScores(3, 76);
      
      //Prints out the updated test scores of John
      System.out.println ();
      System.out.println ("John's score for Test 1 is "+john.getTestScores(1));
      System.out.println ("John's score for Test 2 is "+john.getTestScores(2));
      System.out.println ("John's score for Test 3 is "+john.getTestScores(3));
      
      //Prints out the updated test scores of Marsha
      System.out.println ();
      System.out.println ("Marsha's score for Test 1 is "+marsha.getTestScores(1));
      System.out.println ("Marsha's score for Test 2 is "+marsha.getTestScores(2));
      System.out.println ("Marsha's score for Test 3 is "+marsha.getTestScores(3));
      
      //Re-print out the information of all 4 of the current students to show changes 
      System.out.println ();
      System.out.println (john);
      System.out.println ();
      System.out.println (marsha);
      System.out.println ();
      System.out.println (chris);
      System.out.println ();
      System.out.println (steve);
      int x = 10;
      do {
         System.out.println (x);
         x--;
         } while (x>0);
   }
}

/*
  ----jGRASP exec: java StudentBody
 John Smith
 Home Address:
 21 Jump Street
 Lynchburg, VA  24551
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 0
 Test 2:
 0
 Test 3:
 0
 Average Score:
 0.0
 
 Marsha Jones
 Home Address:
 123 Main Street
 Euclid, OH  44132
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 0
 Test 2:
 0
 Test 3:
 0
 Average Score:
 0.0
 
 Chris Montone
 Home Address:
 321 Anywhere Rd
 Los Angeles, CA  90210
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 100
 Test 2:
 95
 Test 3:
 98
 Average Score:
 97.0
 
 Steve Smith
 Home Address:
 221b Baker Street
 London, EG  12345
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 80
 Test 2:
 60
 Test 3:
 75
 Average Score:
 71.0
 
 John's score for Test 1 is 40
 John's score for Test 2 is 65
 John's score for Test 3 is 78
 
 Marsha's score for Test 1 is 88
 Marsha's score for Test 2 is 93
 Marsha's score for Test 3 is 76
 
 John Smith
 Home Address:
 21 Jump Street
 Lynchburg, VA  24551
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 40
 Test 2:
 65
 Test 3:
 78
 Average Score:
 61.0
 
 Marsha Jones
 Home Address:
 123 Main Street
 Euclid, OH  44132
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 88
 Test 2:
 93
 Test 3:
 76
 Average Score:
 85.0
 
 Chris Montone
 Home Address:
 321 Anywhere Rd
 Los Angeles, CA  90210
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 100
 Test 2:
 95
 Test 3:
 98
 Average Score:
 97.0
 
 Steve Smith
 Home Address:
 221b Baker Street
 London, EG  12345
 School Address:
 800 Lancaster Ave.
 Villanova, PA  19085
 Test 1:
 80
 Test 2:
 60
 Test 3:
 75
 Average Score:
 71.0
 
  ----jGRASP: operation complete.
 
 */