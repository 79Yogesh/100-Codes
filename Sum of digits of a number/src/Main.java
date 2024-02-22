import java.util.*;

class Main{
	
	static int getsum(int num){
		
		if(num == 0) {
			return 0;
		}
		
		return (num%10)+getsum(num/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number   :");
		int num = sc.nextInt();
		
		System.out.println("Sum of digit of "+num+" is    :  "+getsum(num));
		
		
	}
}