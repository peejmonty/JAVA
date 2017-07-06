import java.util.Random;

public class Quiz6
{
   public static void main(String[] args)
   {
      final int SIZE =5;
      random random = new Random();
      int[] myARray = new int[5];
      for (int i = 0; i < myArray.length; i++)
          myArray[i] = random.nextInt(1001);
      printArray(myArray);
   }
   
   public static void printArray(int[] a)
   {
      System.out.println();
      for (int i = 0; i < a.length; i++)
         System.out.printf("[%d]: %5d\n", i, a[i]);
   }

}
