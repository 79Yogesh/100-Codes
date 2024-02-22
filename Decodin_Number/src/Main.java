import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        
        int len = str.length();
        int arr[] = new int[len+1];
        arr[0] = 1;
        arr[1] = 1;
        		
        for(int i=2;i <= len ;i++) {
        	
        	if(str.charAt(i-1)!='0')
        	arr[i] = arr[i-1];
        	
        	if(str.charAt(i-1) == '1' || str.charAt( i-2) == '2' && str.charAt(i-1) <= '6') {
        		arr[i] += arr[i-2];
        	}
        }
        
        
        System.out.println("Number of possibilty     :"+arr[len]);
        
        
        
        
         
	}

}
