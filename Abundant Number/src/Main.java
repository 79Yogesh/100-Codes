import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc =new Scanner(System.in);
          
          int num= sc.nextInt(),sum=0;
          
          for(int i =1;i < num ;i++) {
        	  if(num%i == 0) {
        	  sum += i;
        	  }
          }
          
          if(num < sum) {
        	  System.out.println("Abundant Number ");
        	  System.out.println("The Abundance is: "+(sum-num));
          }else {
        	  System.out.println("Not Abundant Number");
          }
	}

}
