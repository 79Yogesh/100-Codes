import java.util.Scanner;

public class Main {
	
    static boolean isPrime(int temp) {
    	if(temp < 2) {
    		return false;
    	}
    	 for(int i=2; i <=Math.sqrt(temp);i++) {
    		 if( temp%i == 0) {
    			return false;
    		 }
    	 }
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number to be checked : ");
		int nums=sc.nextInt();
		
		
		
		if(isPrime(nums)) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
		
	}

}
