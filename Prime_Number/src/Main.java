import java.util.*;

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
		System.out.println("Enter lower and upper Limit : ");
		int lower=sc.nextInt();
		int upper=sc.nextInt();
		
		
		for(int i=lower ;i < upper;i++)
		{
		   if(isPrime(i)) {
			   System.out.println(i);
		   }
		}
	}

}
