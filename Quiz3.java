import java.util.Scanner;

public class Quiz3
{
   public static void main(String[] args)
   {  
      final int RANGE_LO = 10;
      final int RANGE_HI = 24;
      
      // get num
      Scanner scanner = new Scanner(System.in);
      int num;
      System.out.print("Enter a number between " + RANGE_LO + " and " + RANGE_HI +": ");
      num = scanner.nextInt();    
      while (!(RANGE_LO <= num && num <= RANGE_HI))
      {
         // ask again
         System.out.println("WRONG");
         System.out.print("Enter a number between 10 and 24: ");
         num = scanner.nextInt();
      }
   }  System.out.println("Your nunmber was: " + num);
}      
