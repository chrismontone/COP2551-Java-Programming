//******************************************************************
//    Guess.java
//    Author: Chris Montone
//    Programming Project 3
//    7/5/2015
//    COP2551 Section 412566
//    This program is for a guessing game for the user to guess a number
//    between 1-100 but allowing them to quit by using 0.
//******************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess
{
   public static void main (String[] args)
   {
      //New random number generater object to generate unique numbers;
      Random generator = new Random();
      
      //New scanner object to input guesses.
      Scanner scan = new Scanner (System.in);
      
      //Variables to keep track of the current guess and the number of guesses;
      int guess;
      int count;
      
      //Booleans to used for the while loops
      boolean play = true;
      boolean wrong = true;
      
      //Variable to keep track of the random number
      int num;
      
      //First loop to keep track of whether the user wants to keep playing or not
      while (play) {
        //Creates a random from 1-100 and resets the number of guesses to 0
        //This is inside the 1st loop so a new random number is generated every game
        num = generator.nextInt(100)+1;
        count = 0;
        
        //Second loop to keep track of the user guesses until the guess right.
        while (wrong) {
          
          //Prompts and inputs the users guess into a variable
          System.out.println ("Please enter your guess");
          guess = scan.nextInt();
          
          //Checks if the user wants to quit by hitting '0'
          if ( guess == 0 ) {
            wrong = false;
          }
          
          //Checks and informs the user if they guess too high
          else if ( guess > num ) { 
            System.out.println ("To high guess again");
            count++;
          }
          
          //Checks and informs the user if they guess too low
          else if ( guess < num ) { 
            System.out.println ("To low guess again");
            count++;
          }

          //Prompts the user with a success message and the number of guesses they used
          else {
            System.out.println ("You got it right, it took you: "+count+" tries");
            //Exits the 2nd loop once they guess correctly
            wrong = false;
          }
        }
        
        //Prompts the user if the want to play again and inputs their selection
        System.out.println ("Would you like to play again? 1) Yes 0) No");
        guess = scan.nextInt();
        
          //If the user selects '0' exits the 1st loop
          if ( guess == 0 ) {
            play = false;
          }
          
          //Otherwise re-enters the 2nd loop so the user can play again
          wrong = true;
      }  
   }
}


/*
  ----jGRASP exec: java Guess
 Please enter your guess
 50
 To high guess again
 Please enter your guess
 25
 To high guess again
 Please enter your guess
 12
 To high guess again
 Please enter your guess
 8
 To high guess again
 Please enter your guess
 4
 To low guess again
 Please enter your guess
 6
 You got it right, it took you: 5 tries
 Would you like to play again? 1) Yes 0) No
 1
 Please enter your guess
 50
 To low guess again
 Please enter your guess
 75
 To low guess again
 Please enter your guess
 90
 To high guess again
 Please enter your guess
 85
 To high guess again
 Please enter your guess
 87
 To high guess again
 Please enter your guess
 86
 To high guess again
 Please enter your guess
 85
 To high guess again
 Please enter your guess
 80
 To low guess again
 Please enter your guess
 84
 To high guess again
 Please enter your guess
 83
 To high guess again
 Please enter your guess
 82
 To high guess again
 Please enter your guess
 81
 You got it right, it took you: 11 tries
 Would you like to play again? 1) Yes 0) No
 1
 Please enter your guess
 50
 To low guess again
 Please enter your guess
 75
 To low guess again
 Please enter your guess
 90
 To low guess again
 Please enter your guess
 95
 To high guess again
 Please enter your guess
 93
 To low guess again
 Please enter your guess
 94
 You got it right, it took you: 5 tries
 Would you like to play again? 1) Yes 0) No
 0
 
  ----jGRASP: operation complete.
 
*/