import java.io.*;
import java.util.*;
 
class Main {
    public static void main(String[] args)
    {
        int a[][] = {{0,1,12,3}, {4,5,6,7}, {8,9,10,11}};;
        
        int size = 4;
        int search = 6;
        int temp=0;

        for(int i=0; i<size; i++){

            for(int j=0; j<size; j++){
                if(a[i][j]==search){
                    System.out.println("Element is found ");
                    temp=1;
                    break;
                }
            }

            if(temp==1)
            break;
        }

        if(temp==0)
            System.out.println("Not found");
    }
}