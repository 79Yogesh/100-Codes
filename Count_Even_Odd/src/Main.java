
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 int arr[] = {41,28,64,52,3,57,1,7,46};
	 
	 
	 int oddno = 0,evenno =0;
	 
	  for(int i=0; i < arr.length; i++) {
		  
		  if(arr[i]%2 == 1 ) {
			  oddno++;
		  }
		  else {
		  evenno++;
		  }
	  }
	  
	  System.out.println("No of odd Num is "+evenno);
	  System.out.println("No of odd Num is "+oddno);
	 
		 
	}

}
