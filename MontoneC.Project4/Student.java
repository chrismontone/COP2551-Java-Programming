//******************************************************************
//    Student.java
//    Author: Chris Montone
//    Programming Project 4
//    7/31/2015
//    COP2551 Section 412566
//    A student object classes that contains the students name
//    addresses, and test scores.
//******************************************************************

public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3;

   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = 0;
      test2 = 0;
      test3 = 0;
   }

   //-----------------------------------------------------------------
   //  Overloaded Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student (String first, String last, Address home,
                   Address school, int t1, int t2, int t3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = t1;
      test2 = t2;
      test3 = t3;
   }

   //-----------------------------------------------------------------
   //  Method to set an individual test score for a student
   //-----------------------------------------------------------------
   public void setTestScores(int test, int score)
   {
      if (test == 1) {
         test1 = score;
      }
      else if (test == 2) {
         test2 = score;
      }
      else {
         test3 = score;
      }
   }

   //-----------------------------------------------------------------
   //  Method to retrieve an individual test score for a student
   //-----------------------------------------------------------------
   public int getTestScores(int test)
   {
     if (test == 1) {
         return test1;
      }
      else if (test == 2) {
         return test2;
      }
      else {
         return test3;
      }
   }
   
   public double testAverage()
   {
     return (test1+test2+test3)/3;
   }

   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Test 1:\n" + test1 + "\n";
      result += "Test 2:\n" + test2 + "\n";
      result += "Test 3:\n" + test3 + "\n";
      result += "Average Score:\n"+ testAverage();

      return result;
   }
}
