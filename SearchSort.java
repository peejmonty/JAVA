public class SearchSort
{
   public static void selectionSort(int[] arr)
   {
      int temp, min, i;
      for (i = 0; i < arr.length - 1; i++)
      {
         min = i;
         for (j = i + 1; j < arr.length; j++)
         {
            if (arr[j] < arr[min])
               min = j;
         }
         //swap arr[i] with arr[min]
         if (min != i)
         {
            temp = arr[i];
            arr[i] = arr[min]
            arr[min] = temp;
         }
      }
   }
}
