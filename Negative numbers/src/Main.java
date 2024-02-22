import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int arr[] ={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int p = 0;
        
           int i = 0, j = 0;
       while (j < arr.length) {
           if (arr[j] >= 0) {
               j++;
           }
           else {
        	   for(int k =j ; k>i ;k--) {
                   int temp = arr[k];
                   arr[k] = arr[k - 1];
                   arr[k - 1] = temp;
              }
               i++;
               j++;
           }
       }
           
        for(int r=0; r < arr.length;r++){
            System.out.print(arr[r]+" ");
        }
    }
}