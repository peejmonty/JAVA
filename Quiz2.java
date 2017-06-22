import java.utils.Scanner;

public class Quiz2
{
   public static void main(String[] args)
   {
      final int MAX_PETS = 5;
      int numPets;
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("how many pets do you have? ");
      numPets = kbd.nextInt();
      
      if (numPets > 5)
         System.out.println("you have a lot of pets!");
      else
         System.out.println(numPets + " is not too many pets.");
   }
}
