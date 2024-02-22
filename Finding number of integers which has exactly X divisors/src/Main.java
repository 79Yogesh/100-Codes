
import java.util.*;
 
class Main{
    public static void main(String[] args)
    {
        int  n = 7, x = 2 ;
        int count = 0;
    
        for(int i=1; i<=n; i++){
        
            
            int temp = 0;
            for(int j = 1; j<= i; j++){
                if(i%j==0){
                    temp++;
                }
            }
        
        if(temp == x)
            count++;
    }
        System.out.println(count);
    }
}