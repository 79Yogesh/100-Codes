import java.util.*;
public class Main
{
    public static boolean Array_Equal(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
             
            while (arr[i] % 2 == 0)
                arr[i] /= 2;

            while (arr[i] % 3 == 0)
                arr[i] /= 3;
        }
        
        for (int i = 1; i < n; i++)
            if (arr[i] != arr[0]){
                return false;
            }
        return true;
    }

    public static void main (String[] args)
    {
        int arr[] = { 50, 100, 75 };
    
        int m = arr.length;
        
        if ( Array_Equal(arr, m))
            System.out.print("Equal");
        else
            System.out.print("Not");
    }

}

