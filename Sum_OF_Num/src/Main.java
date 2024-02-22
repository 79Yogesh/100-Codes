import java.util.*;
public class Main {

	
	static int  getnum(int n){
	if(n == 0) {
		return 0;
	}
	return n+getnum(n-1);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number :  ");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
	    
		System.out.println("Sum of "+n+"  natural number    :   "+getnum(n));
	
	}

}
