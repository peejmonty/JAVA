import java.util.Scanner;

public class Quiz3
{
   public static void main(String[] args)
   {  
      // get num
      Scanner scanner = new Scanner(System.in);
      int num;
      System.out.print("Enter a number between 10 and 24: ");
      num = scanner.nextInt();    
      while (!(10 <= num && num <= 24))
      {
         // ask again
         System.out.println("WRONG");
         System.out.print("Enter a number between 10 and 24: ");
         num = scanner.nextInt();
      }
   }  System.out.println("Your nunmber was: " + num);
}      
