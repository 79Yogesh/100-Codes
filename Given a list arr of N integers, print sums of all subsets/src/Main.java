import java.util.*;


public class Main {
       
	static void sumofsubset(int arr[],int s,int e,int sum) {
		
		if(s > e) {
			System.out.print(sum + " ");
			return;
		}
		
		sumofsubset(arr,s+1,e,sum+arr[s]);
		sumofsubset(arr,s+1,e,sum);
		
	}
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int len = sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0 ; i <arr.length ;i++) {
			arr[i] = sc.nextInt();
		}
		
		sumofsubset(arr,0,len-1,0);
		
	}
}
