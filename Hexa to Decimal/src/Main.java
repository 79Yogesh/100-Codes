import java.util.*;

class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("enter the Hexa number");
	
	String n=input.nextLine();
	
	int b=0;
	
     n = n.toUpperCase();
	char a;
	String st="";
	
	String s="0123456789ABCDEF";
	
	int temp=0;
	for(int i =0; i < n.length();i++) {
		
		char c = n.charAt(i);
		int d = s.indexOf(c);
		temp = 16* temp +d;
	}
	
	System.out.print(temp);
	
	}
	}