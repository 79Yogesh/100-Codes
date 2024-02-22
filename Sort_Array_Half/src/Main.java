import java.util.*;

class Main
{
   static void sortArray(int[] arr, int n)
   {
     int temp;
     for(int i=0;i < n-1;i++)
     {
        for(int j = 0;j < n/2; j++) { if(arr[j]>arr[j+1])
            {
              temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
        }

        for(int j = n/2;j < n-1; j++)
        {
            if(arr[j] < arr[j+1])
            {
               temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
            }
         }
      }

      for(int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
         }

   }

   // Driver code
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   int size =sc.nextInt();
	   int arr[] = new int[size];
	   for(int i = 0; i < size; i++) {
		 arr[i] = sc.nextInt();
	   }
       
       sortArray(arr, size);
    }
}