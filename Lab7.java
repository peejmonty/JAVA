public class Lab7
{
   public static void main(String[] args) throws IOException
   {
      greet();
      categorizeFile();
      farewell();
   }
   
   //greetings!
   public static void greet()
   {
      System.out.println("\n\nWelcome to Lab7!\n\n");
   }
   
   public static void categorizedFile() throws IOException
   {
      final int MAX = 30;
      int[] negNum = new int[MAX];
      int negNumCount = 0;
      int[] evenNum = new int[MAX];
      int evenNumCount = 0;
      int[] oddNum = new int[MAX];
      int oddNumCount = 0;
      
      Scanner file = openFile();
      while (file.hasNext())
      {
         number = file.nextInt();
         if (number < 0)
            negNum[negNumCount
      }
   }
}
