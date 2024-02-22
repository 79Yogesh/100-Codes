import java.util.*;

public class Main {

	static int count(int arr[],int len) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
	
		int res =0;
		
		for(int i= 0; i< len;i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		
		return map.size();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int arr[] = {10,20,30,10,11,20,20};
	
		for(int i=0; i< arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.print("No of Element are : "+count(arr,arr.length));
		
		
		
	}

}
