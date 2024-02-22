import java.util.*;

class Main{
	
	static int Reverse(int num,int rev){
		
		if(num == 0) {
			return rev;
		}
	    rev =rev *10 +num%10;
	   
		return Reverse(num/10 ,rev);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number   :");
		int num = sc.nextInt();
		int rev=0;
		System.out.println("Rever of "+num+" is    :  "+Reverse(num,rev));
		
		
	}
}
 