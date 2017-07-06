//Phillip Viens
//Functions
//Purpose: Create a hello function, a goodbye function, an input function
//a calculate function that takes the input value from the input function
and a main function that concatinates all the functions.

import java.util.Scanner;

public class Functions
{
   public static void main(String[] args)
   {
      helloMessage();
      int num = input();
      int x = num;
      calculate(x);
      goodbyeMessage();
      
   }
   
   //hello method
   public static void helloMessage()
   {
      System.out.println();
      System.out.println("Hello! Today we are taking several functions");
      System.out.println("And having them work together in an equation.");
      System.out.println();
   }
   
   //goodbye method
   public static void goodbyeMessage()
   {
      System.out.println();
      System.out.println("Thanks for playing, Goodbye");
      System.out.println();
   }
   
   //input method
   public static int input()
   {
      final int INT_LO = 5;
      fianl int INT_HI = 25;
      int num;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a number between ");
      System.out.print(INT_LO + " and " + INT_HI + ": ");
      num = keyboard.nextInt();
      
      //Checks to see if the int is inside the specified range
      while (!(INT_LO <= num && num <= INT_HI))
      {
         //ask again
         System.out.println();
         System.out.println("TRY AGAIN");
         System.out.println("Please enter a number between ");
         System.out.print(INT_LO + " and " + INT_HI + ": ");
         num = keyboard.nextInt();
         System.out.println("That's outside the specified range");
         System.out.println();
      
      }
      
      return num;
      


   //calculate method
   public static int calculate(int x)
   {
      int results;
   
      results = ((x * 2) - (x + 25));
      System.out.println();
      System.out.println("(" + x + " * 2) - (" + x + " + 25)) = " + results);
      System.out.println();
   
      return results;
   }
}
