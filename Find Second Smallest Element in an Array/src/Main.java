

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {12, 13, 1, 10, 34, 9};
        int size=arr.length;
        
        int First_min = arr[0];
        int Second_min = arr[0];
        for(int i = 1; i< size;i++)
        {
        	if(First_min > arr[i]) {
        		Second_min = First_min;
        		First_min	 = arr[i];
        	}else if(Second_min > arr[i]) {
        		Second_min =arr[i];
        	}
        }
        System.out.println("Second smallest Element is    :"+First_min );
        System.out.println("Second smallest Element is    :"+Second_min );
	}

}
