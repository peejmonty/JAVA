//Phillip Viens
//Lab10
//Purpose: Take in a an Array. Print the Array. 
//Sort the Array in Non Descending order, 
//Search array for an int using binarySearch

import java.util.Scanner;
import java.io.*;
public class Lab10
{
   public static void main(String[] args) throws IOException
   {
      Scanner kbd = new Scanner(System.in);

      //repeat variables to initialize do/while loop
      char repeat;
      String input;

      hello();
      Scanner inputFile = openFile();       //initializes File Varialbe
      int[] Array = Array(inputFile);       //initial Array Variable
      int[] Asc = AscendingArray(Array);    //Sorted Array Varailbe
      do
      {
         int Value = searchValue();
         int results = binarySearch(Asc, Value);
         printResults(Value, results);
         System.out.println();
         System.out.print("Would you like to look another int (y = yes): ");
         input = kbd.nextLine();
         repeat = input.charAt(0);
      
      }while (repeat == 'y' || repeat == 'Y');

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
      System.out.println();
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
         i++;
      }
      inputFile.close();

      //once Array has been taken in 
      //A new perfect one is created with a MAX Value
      // of the index count from the previous array

      final int NEWMAX = i;
      int[] newNums = new int [NEWMAX];
      int l = 0;

      while (l < i)
      {
         newNums[l] = numbers[l];
         l++;
      }   
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

   //method to input a Search Value and returns it
   public static int searchValue()
   {
      Scanner kbd = new Scanner(System.in);
      int searchValue;

      System.out.print("Please give me a number you'd like to search for: ");
      searchValue = kbd.nextInt();
      kbd.nextLine();

      return searchValue;
   }

   //method that searches for the give integer
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

   //method that prints the results of the binary Search
   public static void printResults(int value, int results)
   {
      if (results == -1)
      {
         System.out.println(value + " was not found in the array");
      }
      else
      {
         System.out.println(value + " was found at [index] " + results);
      }
   }
   
   //print Array Function
   public static void printArray(int[] Array)
   {
      int i;

      System.out.println();
      
      //for loop that prints Arrays
      for( i = 0; i < Array.length; i++)
      {
         System.out.println(i + ", " + Array[i]);
      }
      System.out.println();
   }
}