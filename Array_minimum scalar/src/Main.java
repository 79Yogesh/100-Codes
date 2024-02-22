
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int arr1[] = {2,1,4,6,3};
		
		int arr2[] = {2,1,5,4,3};
		int len = arr1.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
				
				if (arr2[i] < arr2[j]) {
					int temp = arr1[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		int pro1 =0;
		for(int i =0;i < len;i++) {
			pro1 = pro1 + arr1[i]*arr2[i];
 			
		}
		
			System.out.println("Scaler :  "+pro1);
	
	}

}
