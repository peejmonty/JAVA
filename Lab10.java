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
      int[] Array = Array(inputFile);
      int[] Asc = AscendingArray(Array);

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

   public static int[] Array(Scanner inputFile) throws IOException
   {
      final int MAX = 30;
      int[] numbers = new int [MAX];
      int i = 0;
      
      while (inputFile.hasNext() && i < numbers.length)
      {
         numbers[i] = inputFile.nextInt();
         System.out.println(numbers[i]);
         i++;
      }

      final int NEWMAX = i;
      int[] newNums = new int [NEWMAX];
      int l = 0;

      while (l < i)
      {
         newNums[l] = numbers[l];
      }
      return newNums;
   }

   public static int[] AscendingArray(int[] Array) throws IOException
   {
      int temp, min, i, j;
      for (i = 0; i < Array.length - 1; i++)
      {
         min = i;
         for (j = i + 1; j < Array.length; j++)
         {
            if(Array[j] < Array[min])
            min = j;
         }
         if (min != i)
         {
            temp = Array[i];
            Array[i] = Array[min];
            Array[min] = temp;
         }
         System.out.println(Array[i]);
      }
      return Array;
   }
}