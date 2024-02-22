import java.util.Scanner;

class Main{
	
	static int factorial(int num ,int fact){
		
		if(num == 0) {
			return fact;
		}
	    fact *= num;
	   
		return fact;
	}
	
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number   :");
		int num = sc.nextInt();
		int fact=1;
		
		
		System.out.println("Factorial of "+num+" is   :     "+factorial(num,fact));
		
		
	}
	
}

 