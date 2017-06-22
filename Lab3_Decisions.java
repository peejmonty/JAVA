// Phillip Viens
// Decisions
// Purpose: Take two integers and decide if integer2 is a factor of 
//           integer1

import java.util.Scanner;

public class Decisions
{
   public static void main(Strings[] args)
   {
      int Int1;   // initializes integer1
      int Int2;   // initializes integer2
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Hello, Let's do some division!");
      System.out.println();
      
      // Has the user input the first integer
      System.out.println("Please enter integer1. ");
      Int1 = keyboard.nextInt();
      
      // Has the user input the second integer
      System.out.println("Please enter integer2. ");
      Int2 = keyboard.nextInt();
      
      // Checks to see if either of the integers are equal to zero
      if (Int1 == 0 || Int2 == 0)
      {
         System.out.println("Can't divide by zero!");
      }
      
      // Checks to see if Int1 is less than Int2
      else if (Int1 < Int2)
      {
         System.out.println(Int1 + " is not divisible by " + Int2 + ".");
      }
      
      // Checks to see if the result is a factor.
      else if (Int1 % Int2 !=0)
      {
         System.out.println(Int1 + " is not divisible by " + Int2 + ".");
      }
      
      //If there is no remainder it divides Int1 by Int2 to output 
      // the factor.
      else
      {
         // initializes Int3 to be the result of Int1/Int2
         int Int3 = Int1 / Int2;
         
         // Three lines which display the final outcome if there is infact a factor
         System.out.println("Given the first integer of " + Int1 + ",");
         System.out.println("and the second integer of " + Int2 + ".");
         System.out.println("You have a factor of " + Int3 + ".");
      }
      
      // exit message which displays regaurdless of the outcome
      System.out.println("Thanks for playing, Goodbye!");
   }
}
