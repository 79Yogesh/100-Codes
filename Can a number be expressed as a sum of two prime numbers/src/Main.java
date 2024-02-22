import java.util.*;
public class Main {

	static boolean isPrime(int num) {
		
		for(int i=2 ; i < Math.sqrt(num);i++) {
			
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		Scanner sc=new Scanner( System.in);
		
		int num = sc.nextInt();
		
		for(int i = 2; i< num ;i++) {
			
			if(isPrime(i)) {
				if(isPrime(num-i)) {
					System.out.println(i+" + "+(num-i));
					break;
				}
			}
		}
	}

}
