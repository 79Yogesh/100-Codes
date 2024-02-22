import java.util.*;
public class Main {

	static int decode(char[] num) {
		 
		int len = num.length;
		 int cnt[] = new int[len+ 1];

	        cnt[0] = 1;

	        cnt[1] = 1;

	        for (int k = 2; k <= len; k++) 
	        { 
	            cnt[k] = 0; 

	            cnt[k] = cnt[k-1];

	            if (num[k-2] == '1' || (num[k-2] == '2' && num[k-1] < '7') )

	                cnt[k] += cnt[k-2];
	        }
	        return cnt[len];
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String str = Integer.toString(num);
		System.out.println(decode(str.toCharArray()));
		
		
		
		
	}

}
