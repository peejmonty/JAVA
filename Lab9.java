//Phillip Viens
//Lab 9
//Purpose: To take in values from a file. Print them in a perfect array
//Then sort that values and then print them again.

import java.util.Scanner;
import java.io.*;

public class Lab9
{
   public static void main(String[] args) throws IOException
   {
      hello();
      Scanner inputFile = openFile();
      String[] Words = fileRead(inputFile);
      String[] sortedWords = fileSort(Words);
      printArrays(Words, sortedWords);
      goodbye();

     inputFile.close();
   }
   
   //hello method
   public static void hello()
   {
      System.out.println();
      System.out.println("Hello! Welcome to file sort.");
      System.out.println("We are reading a file and printing it.");
      System.out.println("Then we are sorting the file and printing that.");
      System.out.println();
        
   }
   
   //goodbye method
   public static void goodbye()
   {
      System.out.println();
      System.out.println("Peace Out Cub Scout!");
      System.out.println();
        
   }
   
   //method that opens the file
   public static Scanner openFile() throws IOException
   {
      //Opens the file
      String filename = "lab9input.txt";
      File file = new File (filename);
      Scanner inputFile = new Scanner(file);
        
      return inputFile;
   }   
   
   // method to read the file and print the array
   public static String[] fileRead(Scanner inputFile) throws IOException
   {   
      final int MAX = 60;
      int count = 0;
      int index = 0;
      String[] words = new String[MAX];
        
      // takes in the strings and increments a count for
      // the new max to create a perfect array
      while (inputFile.hasNext() && count < words.length)
      {
         words[count] = inputFile.nextLine();
         count++;       
      }
        
        
      System.out.println(count);
      final int NEWMAX = count;
      String[] theWords = new String [count];

      //creates and prints a new perfect array
      while (index < count)
      {
         theWords[index] = words[index];
         //System.out.println(index + ", " + theWords[index]);
           
         index ++;
      }
        
      //returns the perfect array
      return theWords;
        
        
   }
    
   //Method that sorts the array then
   public static String[] fileSort(String[] sortWords) throws IOException
   {  
      //Temporary string to hold the new sorted array values  
      String temp;      
      int min, i, j;

      for ( i = 0; i <= sortWords.length - 1; i++)
      {
         min = i;
         for (j = i + 1; j < sortWords.length; j++)
         {   
            //Coninuously checks for equal String lengths
            //Then moves on to the next string.
            if (sortWords[j].compareTo(sortWords[min]) < 0)
               min = j;
         }
         
         
         if (min != i)
         {
            temp = sortWords[i];
            sortWords[i] = sortWords[min];
            sortWords[min] = temp;
         }
          
         //System.out.println(i + ", " + sortWords[i]);
      }
      return sortWords;
   }
   
   public static void printArrays(String[] words, String[] sortWords)
   {
      for(int i = 0; i < words.length; i++)
      {
         System.out.println(i + ", " + words[i]);
      }
    
      for (int i = 0; i < sortWords.length; i++)
      {
         System.out.println(i + ", " + sortWords[i]);
      }

   }
    
} 
