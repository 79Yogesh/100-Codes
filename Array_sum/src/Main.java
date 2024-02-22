import java.util.*;
public class Main {

	static int sumArray(int arr[] , int size) {
		
		if(size == 0) {
			return arr[size];
		}
		
		return arr[size] + sumArray(arr,size-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        
		int size = sc.nextInt();
		
		int arr[] =new int[size];
		
		for(int i=0 ; i<size ;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Sum of array is         :"+ sumArray(arr,size-1));
	}

}
