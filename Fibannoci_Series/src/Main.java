import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int num = sc.nextInt();
      
  
      int[] arr= new int[num];
      arr[0] =0;
      
      
      if(num  == 1) {
      System.out.print(arr[0]+" ");}
      else {
    	  arr[1] =1;
    	  System.out.print(arr[0]+" "+arr[1]+" ");}
      
      
       for(int i=2 ;i < num;i++)
      {
    	arr[i] =  arr[i-1] +arr[i-2];
    	System.out.print(arr[i]+" ");
      }
      
     
	}

}
