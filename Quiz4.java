// Create a program that using a for loop allows the user to input the number of friends they have
//and then lists their names

import java.util.Scanner;

public class Quiz4
{
   public static void main(String[] args)
   {
      Scanner keyboard = mew Scanner(System.in);
      int numFriends;
      
      System.out.print("How many friends do you have? ");
      numFriends = keybaord.nextInt();
      
      for( int i =0; i < numFriends ; i++ )
      {
         System.out.print("Name of friend: ");
         friend = keyboard.nextLine();
         System.out.println(name);
      }
   }
}      
