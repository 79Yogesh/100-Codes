import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int temp=num,rev=0;
      while(temp >0) {
    	  rev =rev*10 + temp%10;
    	  temp = temp/10;
      }
      
      if(rev == num) {
    	  System.out.println("Palindrome");
      }else {
    	  System.out.println("Not Palindrome");
      }
	}

}
