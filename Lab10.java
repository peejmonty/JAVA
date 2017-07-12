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
      Scanner inputFile = openFile();
      int[] Array = Array(inputFile);
      printArray(Array);
      int[] Asc = AscendingArray(Array);
      printArray(Asc);
      int Value = searchValue();
      int results = binarySearch(Asc, Value);
      printResults(Value, results);
      goodbye();
   }
   
   //hello message method
   public static void hello()
   {
      System.out.println("Hello!");
      System.out.println("Welcom to my last and final lab");
      System.out.println();
   }

   //goodbye message method
   public static void goodbye()
   {
      System.out.println();
      System.out.println("Thanks for watching");
      System.out.println("Peace out cub scout");
   }

   //method that opens the file

   public static Scanner openFile() throws IOException
   {
      String filename = "lab10input.txt";
      File file = new File (filename);
      Scanner inputFile = new Scanner(file);

      return inputFile; 
   }

   //method that reads the file and takes in the array
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
         l++;
      }
      //inputFile.close();
      //System.out.println("This function is finished now");
      return newNums;
   }

   //method that sorts the Array in ascending order
   public static int[] AscendingArray(int[] Array) throws IOException
   {
      for (int i = 0; i < Array.length; i++)
      {
         for(int j = i + 1; j < Array.length; j++)
         {
            if (Array[i] > Array[j])
            {
               int temp = Array[i];
               Array[i] = Array[j];
               Array[j] = temp;
            }
         }
      }
      return Array;
   }

   public static int searchValue()
   {
      Scanner kbd = new Scanner(System.in);
      int searchValue;

      System.out.print("Please give me a number you'd like to search for: ");
      searchValue = kbd.nextInt();
      kbd.nextLine();

      return searchValue;
   }

   public static int binarySearch(int[] arr, int key) throws IOException
   {

      int left = 0, right = arr.length - 1;
      while (left <= right)
      {
         int mid = (left + right) / 2;
         if (arr[mid]  == key)
         {
            return mid;
         }
         else if (arr[mid] < key)
         {
            left = mid + 1;
         }
         else
         {
            right = mid - 1;
         }
      }
      return -1;
   }

   public static void printResults(int value, int results)
   {
      if (results == -1)
      {
         System.out.println(value + " was not found in the array");
      }
      else
      {
         System.out.println(value + " was found at " + results);
      }
   }
   public static void printArray(int[] Array)
   {
      int i;

      for( i = 0; i < Array.length; i++)

      {
         System.out.println(i + ", " + Array[i]);
      }
   }

}