//Phillip Viens
//Lab10
//Purpose: I don't know yet

import java.util.Scanner;
import java.io.*;
public class Lab10
{
   public static void main(String[] args) throws IOException
   {
      hello();
      goodbye();
      Scanner inputFile = openFile();
   }
   public static void hello()
   {
      System.out.println("Hello!");
      System.out.println("Welcom to my last and final lab");
      System.out.println();
   }
   public static void goodbye()
   {
      System.out.println();
      System.out.println("Thanks for watching");
      System.out.println("Peace out cub scout");
   }

   public static Scanner openFile() throws IOException
   {
      String filename = "lab10input.txt";
      Scanner inputFile = new Scanner(filename);
      File file = new File(filename);

      return inputFile; 
   }
}