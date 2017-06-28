//Phillip Viens
//Repeating
//Purpose: Take two integers and decide if integer 2 is a factor of integer 1

import java.util.Scanner;

public class Repeating
{
   pubilc static void main(String[] args)
   {
      int Int1;       //initializes first integer
      int Int2;       //initializes second integer
      char repeat;    //initializes the repeat variable
      String input;   //string to hold the input
      
      Scanner keyboard = new Scanner(System.in);
      do
      {
         System.out.println();
         System.out.println("Hello. Please input 2 integers to determine");
         System.out.println("whether or not the second integer");
         System.out.println("is a factor of the first integer.");
         System.out.println("If a factor exists. The factor will be displayed");
         System.out.println();
         
         //Has the user input the first integer
         System.out.print("Please enter integer 1: ");
         Int 1 = keyboard.nextInt();
         System.out.println();
         
         //Has the user input the second integer that is not a 0
         do 
         {
            System.out.println("For integer 2");
            System.out.print("Please enter a value greater than 0: ");
            Int2 = keyboard.nextInt();
            keyboard.nextLine();
          } while (Int2 == 0);
          
          // Checks to see if the result is a factor.
          if (Int1 % Int2 != 0)
          {
             System.out.println(Int1 + " is not divisible by " + Int2 + ".");
          }
          
          //If there is no remainder it divides Int1 by Int2 to output the factor
          else
          {
             //Initializes Int3 so that it's the result of Int1/Int2
             int Int3 = Int1 / Int2;
             
             //Three lines that print out the results
             System.out.println();
             System.out.println("Given the first integer of " + Int1 + ",");
             System.out.println("and the second integer of " + Int2  + ".');
             System.out.println("You have a factor of " + Int3 + ".");
          }
          
          // Prompts the user to replay the game
          System.out.println();
          System.out.print("Would you like to play again (y=yes)? ");
          input = keyboard.nextLine();
          
          repeat = input.charAt(0);
          
      } while (repeat == 'Y' || repeat == 'y');
      
      //Goodbye message
      System.out.println();
      System.out.prinln("Thank you for playing, Goodbye!");
   }
}   
