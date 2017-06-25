//Phillip Viens
//GuessGame
//Purpose: Has the computer take a random number and has the user guess
//The user is told if the guess is too high or too low or spot on.
//The user is allowed to repeat as many times as they'd like

import java.util.Scanner;
import java.util.Random;

public class GuessGame
{
   public static void main(String[] args)
   {
      int number;           //initializes the random variable
      int guess;            //initializes the users guess
      String again = "y";   //String that holds the while repeat variable
      char repeat;          //char for do while repeat variable
      int range;            //input for range of number guess
      String input;         //String to hold the repeat input

      // do/while loop that repeats
      do
      {
         // creates a random integer
         Random rand = new Random();

         // creates an input variable
         Scanner keyboard = new Scanner(System.in);

         //Opening display message
         System.out.println();
         System.out.println("Lets play a guessing game.");
         System.out.println("You are about to be asked to give a number.");
         System.out.println("Once you've given the number I will generate");
         System.out.println("a random number between 1 and the number you");
         System.out.println("gave!");
         System.out.println("Then you will be asked to guess the random");
         System.out.println("number that I have generated.");
         System.out.println();
         System.out.println();
         System.out.print("Okay Lets get started. Give me a number: ");
         range = keyboard.nextInt();
         keyboard.nextLine(System.out.println();
         System.out.print("I'll pick a number between 1 and " + range +".");
         System.out.println();


         number = rand.nextInt(range) + 1;

         //Displays the random number picked for verifaction purposes
         System.out.println();
         System.out.println(number);
         System.out.println();

         //While loop to repeat guesses if instructed
         while (again.equalsIgnoreCase("y"))
            {
               System.out.print("Guess a number: ");
               guess = keyboard.nextInt();
               keyboard.nextLine();

               //Checks to see if guess is lower than generated number
               if (guess < number)
               {
                  System.out.println("Thats too low!");
                  System.out.println();
                  System.out.print("Guess again (y = yes)? ");
                  again = keyboard.nextLine();
               }

               //Checks to see if guess is higher than generated number
               else if (guess > number)
               {
                   System.out.println("That Guess is too high.");
                   System.out.println();
                   System.out.print("Guess again (y = yes)? ");
                   again = keyboard.nextLine();
               }

               // prompts the user if guessed correctly
               else
               {
               System.out.println("Awesome Sauce you guessed it!");
               break;
               }
                                                           86,1          75%);
System.out.println();
         System.out.print("I'll pick a number between 1 and " + range +".");
         System.out.println();


         number = rand.nextInt(range) + 1;

         //Displays the random number picked for verifaction purposes
         System.out.println();
         System.out.println(number);
         System.out.println();

         //While loop to repeat guesses if instructed
         while (again.equalsIgnoreCase("y"))
            {
               System.out.print("Guess a number: ");
               guess = keyboard.nextInt();
               keyboard.nextLine();

               //Checks to see if guess is lower than generated number
               if (guess < number)
               {
                  System.out.println("Thats too low!");
                  System.out.println();
                  System.out.print("Guess again (y = yes)? ");
                  again = keyboard.nextLine();
               }

               //Checks to see if guess is higher than generated number
               else if (guess > number)
               {
                   System.out.println("That Guess is too high.");
                   System.out.println();
                   System.out.print("Guess again (y = yes)? ");
                   again = keyboard.nextLine();
               }

               // prompts the user if guessed correctly
               else
               {
               System.out.println("Awesome Sauce you guessed it!");
               break;
               }
                  }
               System.out.println();
               System.out.print("Play again (y = yes)? ");
               input = keyboard.nextLine();

               repeat = input.charAt(0);


          // repeats the entire game if user presses yes
      }   while ( repeat == 'Y' || repeat == 'y');
          System.out.println("Thanks for playing! Buh Bye!");

   }
}
