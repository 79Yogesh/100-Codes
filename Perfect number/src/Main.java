import java.util.*;

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
          
          if(num == sum) {
        	  System.out.println("Number is prefect");
          }else {
        	  System.out.println("Number Not a prefect");
          }
	}

}
