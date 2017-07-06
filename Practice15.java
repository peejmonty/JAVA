public class Practice15
{
   public static void main(String[] args)
   {
      final int MAX = 50;
      Scanner console = new Scanner(System.in);
      int howMany;
      double[] myArray = new double[MAX];
      
      //get array values from user (later: fillRandom)
      System.out.print("How many numbers? ");
      howMany = console.nextInt();
      for (int i = 0; i < howMany; i++
         myArray[i] = console.nextDouble();
      
      //copy to another array
      perfectArray = new double[howMany];
      for (int i = 0; i < perfectArray.length; i++)
         perfectArray[i] = myArray[i];
         
      //calculate the average of the values in the array (and print it
      average = calculateAverage(perfectArray);
      sum = 0;
      for (int i = 0; i < perfectArray.length; i++)
         sum += perfectArray[i];
      average = sum / perfectArray.length;
      System.out.println("agerage: " + average);      
       // print out the array
       
       public static double[] fillRandom(int howMany)
       {
          Random random = new Random();
          double[] randArray = new double[howMany];
          for (int i = 0; i < randArray.length; i++)
             randArray = 
             
       }
       for (int i = 0; i < perfectArray.length; i++)
          System.out.print(perfectArray[i] + " ");
       System.out.println();
   }
   public static void printArray(double[] a)
   {
      for(int i = 0; i < a.length; i++)
         System.out.println();
      System.out.println();
   }
   // calculate the mean of all the entries in the given array
   public static double calculateAverage(double[] a)
   {
      double sum = 0;
      for (int i = 0; i < a.length; i++)
         sum += a[i];
      return sum / a.length;
   
   //MAke an array (up to 50) of doubles entered from the user
   public static double[] enterArray()
   {
      final in MAX = 50;
      Scanner console = new Scanner(System.in);
      int howMany;
      double[] a = new double[MAX];
      
      System.out.print("How many number? ");
      howMany = console.nextInt();
      for (int i = 0; i < howMany; i++)
         a[i] = console.nextDouble();
      console.close();
      return a;
   }
}
