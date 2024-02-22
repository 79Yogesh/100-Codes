
import java.util.*;

class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter the decimal number");
	
	int n=input.nextInt();
	
	int b=0;
	
	char a;
	String st="";
	
	String s="0123456789ABCDEF";
	
	while(n!=0)
	{
		b=n%16;
		a=s.charAt(b);
		st += a;
		n=n/16;
	}
	
	System.out.print(st);
	
	}
	}