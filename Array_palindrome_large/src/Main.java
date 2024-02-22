

public class Main {
	
	static int palindrome(int n) {
		int rev =0;
		
		while(n > 0) {
			 rev = rev*10 + n%10;
			 n = n/10;
		}
		
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int arr[] = {10,565,16161,11};
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0 ;i <arr.length;i++) {
		  
			int temp = palindrome(arr[i]);
			
			if(temp == arr[i] && temp > max) {
				max = temp;
			}
		
		}
		
		System.out.println("Largest Palindrome : "+max);
	}

}
