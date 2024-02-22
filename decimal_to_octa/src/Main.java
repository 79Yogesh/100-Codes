
import java.util.*;

class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter the decimal number");
	
	int n=input.nextInt();
	
	int temp=1,octal=0;
	
	
	
	
	
	
	while(n!=0)
	{
		int rem = n%8;
	    octal += temp*rem;
	    
	    temp *= 10;
	    
	    n = n/8;
	}
	
	System.out.print(octal);
	
	}
	}