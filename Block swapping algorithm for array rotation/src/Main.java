import java.util.*;

public class Main {

	public static void rotate(int arr[],int i, int p,int len) {
		
		
		if(p == 0 || p == len) {
			return ;
		}
		
	    if(len-p == p) {
	    	swap(arr,i,len-p+i,p);
	    	return;
	    }
	    
	    if(p < len -p) {
	    	swap(arr,i,len-p+i,p);
	    	rotate(arr,i,p,len-p);
	    	
	    }
	    else {
	    	swap(arr,i,p ,len-p);
	    	rotate(arr,len-p+i,2*p-2,p);
	    }
		
		
		
		
	}
	
	public static void swap(int arr[],int e,int s,int p) {
		for(int i= 0 ; i <p ;i++) {
			int temp = arr[e+i];
			arr[e+i] = arr[s+i];
			arr[s+i] = temp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner sc =new Scanner(System.in);
		int len= sc.nextInt();
		int arr[] = new int[len];
		
		for(int i=0; i < arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		
		rotate(arr,0,2,arr.length);
		for(int i=0; i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	} 

}
