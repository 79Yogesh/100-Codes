import java.util.*;
 
class Main{

public static void main (String[] args)
{
    Scanner sc =new Scanner(System.in);
    
    int num = sc.nextInt();
   
    int temp = 1;
    System.out.print(temp);
     
    for(int i = 1; i <= num; i++)
    {
       int curr = (temp *( num - i + 1)) / i;
       System.out.print("  " + curr);
       temp = curr;
    }
}
}