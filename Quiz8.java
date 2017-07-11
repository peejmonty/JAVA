public class Quiz8
{
   public static void main(String[] args)
   {
      int[][] ragged = {{1, 4, -17}, {2, 3,}, {-1, -2, -7},
                        {-8, -14, 100, 99, 5011, -3}, {6}};
      boolean found = raggedSearch(ragged, -3);
      if (found)
         System.out.println("-3 found");
      else
         System.out.println("-3 not found");
   }
   
   public static boolean raggedSearch(int[][] ragged, int target)
   {
       
       for (int i = 0; row < ragged.length; i++)
       {
          for(int j = 0; j < ragged[j].length; j++)
          {
              if (ragged[i][j] == target)
                 return true;
        
          }
       
   }
   return false;
}
