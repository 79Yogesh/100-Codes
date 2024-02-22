

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
	
		for(int i=1 ;i < 100;i++)
		{
		   if(isPrime(i)) {
			   System.out.print(i+" ");
		   }
		}
	}

}
