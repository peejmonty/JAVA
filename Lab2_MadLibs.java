// Phillip Viens
// MadLibs.java
// Purpose: This program will play a "Mad Libs" type game with the user.
// The program should request several values in different categories then
// insert them into a paragraph

import java.util.Scanner;

public class MadLibs
{
   public static void main(String[] args)
   {
      String name;        // NAME
      String place;       // PLACE
      String college;     // COLLEGE
      String profession;  // PROFESSION
      String animal;      // ANIMAL
      String petName;     // PETNAME
      int number;         // NUMBER

      Scanner keyboard = new Scanner(System.in);

      System.out.println("To create a Madlibs Please: ");

      System.out.print("Enter a Name ");
      name = keyboard.nextLine();

      System.out.print("Enter the name of a place ");
      place = keyboard.nextLine();

      System.out.print("Enter the name of a college ");
      college = keyboard.nextLine();

      System.out.print("Enter the name of a profession ");
      profession = keyboard.nextLine();

      System.out.print("Enter a type of animal ");
      animal = keyboard.nextLine();

      System.out.print("Enter a pet's name ");
      petName = keyboard.nextLine();

      System.out.print("Enter a Number ");
      number = keyboard.nextInt();

      System.out.println();

      System.out.println("There once was a person named "+ name);
      System.out.println("who lived in " + place + ". At the age of " );
      System.out.println(number + ", " + name + " went to college at ");
      System.out.println(college + ". " + name + " graduated and went");
      System.out.println("to work as a " + profession + ". Then, " + name);
      System.out.println("adopted a(n) " + animal + " named " + petName + ".");
      System.out.println("They both lived happily ever after!");

      System.out.println();

      System.out.println("Thanks for playing!");
      System.out.println("Goodbye!");
   }
}
