import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner sc = new Scanner(System.in);
//		int len = sc.nextInt();
//		int[] arr = new int[len];
//		for(int i=0 ;i <arr.length;i++) {
//			
//			arr[i] = sc.nextInt();
//	    }
		
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		
	
		int max=Integer.MIN_VALUE;
		int sum =0;
		int start =0;
		int end=0,s=0;
		
		for(int i =0; i< arr.length;i++) {
		    sum =sum +arr[i];
			if(max < sum) {
				max = sum;
				start = s;
				end =i;
			}
			if(sum < 0 ) {
				sum =0;
				s =i+1;
			}
		}
		
		System.out.println(max);
		for(int i =start ;i <=end;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
		
	}

}
